package com.zietgiest.hashutils.bloomfilter;

import java.nio.ByteBuffer;
import java.util.BitSet;

import com.zietgiest.hashutils.murmurhash.MurmurHash;

public class MurmurHash3BloomFilter<E extends Element> implements BloomFilter<E> {
    /*
     * Restricts the size of the Bloom filter
     * Need to move to Open Bitset.
     */
    public final BitSet bitset;

    public final int nHashes;

    @Override
    public void add(E element) {
        for (int index : bitPositions(element)) {
            bitset.set(index);
        }
    }

    @Override
    public boolean possiblyContains(E element) {
        for (int index : bitPositions(element)) {
            if (!bitset.get(index)) {
                return false;
            }
        }
        return true;
    }

    
    private int[] bitPositions(Element e) {
    	ByteBuffer key = e.getKey();
        long[] hashes = MurmurHash.hash3_x64_128(key, key.position(), key.remaining(), 0L);
        int[] positions = new int[nHashes];
        for (int i = 0; i< nHashes; i++ ) {
        	// TBD : Need to move towards Open Bitset implementation to avoid 
        	// casting of long to int 
            positions[i] = (int) ((hashes[0] + i * hashes[1]) % bitset.size());
        }
        return positions;
    }

    public MurmurHash3BloomFilter(int nBits, int nHashes) {
        bitset = new BitSet(nBits);
        this.nHashes = nHashes;
    }
}
Hash-utils
==========
This library is a collection of hash utilities that are useful in many applications. The initial focus will be on Bloom filters and Locality Sensitive Hashes, like Minhash. Later this will be expanded to SimHash, GeoHashes, Merkle Trees and other functions.

### Uses
Hashes are indispensable for doing scalable linear algorithms. They usually provide dimension reduction of high dimensional data. Even though hashes are not perfect (in terms of for averting collision), they can be used in a wide variety of applications. Applications include dictionaries, similarity matching, checksums, finger prints, near duplicate detection and many more.

### Bloom filters
Bloom filters are probabilistic data structures to efficiently test whether element belongs to a collection. In other words, they can be used to test whether an element is "possibly in set" or "definitely not in set". The implementation currently uses non-cryptographic Murmur3 Hash.

Bloom Filter tutorial: http://billmill.org/bloomfilter-tutorial/

### Locality Sensitive Hashes
Unlike traditional hashes that aim to avert collisions, locality sensitive hashes tries to group entries that are close to each other in same bucket. This allows us to find similar entries in a large database with a linear scan.

On example of locality sensitive hashes is Min Hashes, which can be a useful approximation for computing Jaccard Similarity to identify similar vectors.

MinHash : http://infolab.stanford.edu/~ullman/mmds/ch3a.pdf

This is still work in progress.

### Maven
* groupId : com.zeitgiest
* artifactId: hash-utils
* version : 0.1-SNAPSHOT

### License
Apache Public License (APL) 2.0

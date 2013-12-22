hash-utils
==========

This is a collection of hash utilities that are useful in many applications. This library will initially focus on Bloom filters and SimHashes (Locality Sensitive Hashing). Later this will be expanded to Merkle trees, Geo Hashes and other functions. Sample usage will also be provided.

### Uses
Hashes usually provide dimension reduction of high dimensional data. Even though hashes are not perfect, they can be used in a wide variety of applications. Applications vary from dictionaries, similarity matching, checksums, finger prints and many more.

### Bloom filters
Bloom filters are probabilistic data structures to efficiently test whether element belongs to a collection. They can be test whether an element is "possibly in set" or "definitely not in set".

### Maven
<dependency>
      <groupId>com.zeitgiest</groupId>
      <artifactId>hash-utils</artifactId>
      <version>0.1-SNAPSHOT</version>
</dependency>

### License
Apache Public License (APL) 2.0

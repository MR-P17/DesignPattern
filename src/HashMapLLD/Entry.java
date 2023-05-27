package HashMapLLD;

public class Entry<K, V> {
    K key;
    V value;
    Entry nextEntry;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        this.nextEntry = null;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry getNextEntry() {
        return nextEntry;
    }
}

package HashMapLLD;

public class MyHashMap<K ,V> {
    public static int INITIAL_CAP = 1 << 4;
    public static int MAX_CAP = 1 << 30;

    public Entry[] hashTable;

    public MyHashMap(){
        this.hashTable = new Entry[INITIAL_CAP];
    }

    public MyHashMap(int capacity){
        int nextSize = getTableSize(capacity);
        this.hashTable = new Entry[nextSize];
    }

    public int getTableSize(int cap){
        int n = cap-1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAX_CAP) ? MAX_CAP : n+1;
    }

    public void put(K key, V value){
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if(node == null){
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        }else{
            Entry prevNode = node;
            while(node != null){
                if(node.key == key){
                    node.value = value;
                    return;
                }
                prevNode = node;
                node = node.nextEntry;
            }
            Entry newNode = new Entry(key, value);
            prevNode.nextEntry = newNode;
        }
    }

    public V get(K key){
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        while(node != null){
            if(node.key == key)
                return (V) node.value;
            node = node.nextEntry;
        }
        return null;
    }

    public void print(){
        for(int i=0;i<hashTable.length;i++){
            Entry node = hashTable[i];
            while(node != null){
                System.out.print(node.key +" -> " + node.value + "     ");
                node = node.nextEntry;
            }
            System.out.println();
        }
    }
}



package HashMapLLD;


public class MainMap {
    public static void main(String[] args) {
        MyHashMap<Integer, String> mp = new MyHashMap<>(7);
        mp.put(1, "hello");
        mp.put(2, "Hi");
        mp.put(3, "Lol");
        mp.put(4, "Bye");
        mp.put(5, "Me");
        mp.put(6, "peace");
        mp.put(7, "love");
        mp.put(8, "vision");
        mp.put(9, "believe");
        mp.put(10, "succeed");

        mp.print();
        String res = mp.get(7);
        System.out.println("Get result: "+ res);
    }
}

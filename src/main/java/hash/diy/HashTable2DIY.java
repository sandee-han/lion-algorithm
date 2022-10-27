package hash.diy;

import java.util.ArrayList;
import java.util.List;

public class HashTable2DIY {

    class Node {
        private String key;
        private int value;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }


    public int hash(String key) {
        int asciiSum = 0;
        for(int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }

    int size = 10000;

    List<Node>[] table = new ArrayList[size];


    public void insert(String key, int value) {
        List<Node> insertList = new ArrayList<>();
        if(table[hash(key)] == null){
            table[hash(key)] = insertList;

        }
        this.table[hash(key)].add(new Node(key, value));
    }

    public Integer get(String key) {
        List<Node> getList = new ArrayList<>();
        for (Node node : getList) {
            if(key.equals(node.getKey())){
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable2DIY ht2 = new HashTable2DIY();
        ht2.insert("Chuu", 1);
        System.out.println(ht2.get("Chuu"));
    }
}

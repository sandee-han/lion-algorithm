package hash;

import java.util.ArrayList;
import java.util.List;

public class HashTable2 {
    // key, value를 저장하기 위한 Object
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
        public String getKey() {
            return key;
        }
        public Integer getValue() {
            return value;
        }
    }
    List<Node>[] table = new ArrayList[1000];

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }

    public void insert(String key, int value) {
        // List
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();    // 데이터를 넣은 적이 없으면 null이므로 ArrayList생성
        }
        //  key, value를 같이 넣기 위해서 Map 을 쓰거나 / Object를 만들거나
        this.table[hashIdx].add(new Node(key, value));
    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if(key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable2 ht = new HashTable2();
        ht.insert("Yoonseo", 1);
        ht.insert("SeoYoon", 2);

        int result = ht.get("Yoonseo");
        if(result == 1) {
            System.out.println("test success");
        } else {
            System.out.println("test fail");
        }
    }
}

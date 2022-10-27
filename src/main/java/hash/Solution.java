package hash;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int size = 10000;
    List<Solution.Node>[] table = new ArrayList[1000];

    public Solution() {
    }

    public Solution(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

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

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }

    public void insert(String key, int value) {
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();
        }
        this.table[hashIdx].add(new Node(key, value));
    }

    public Integer get(String key) {
        List<Solution.Node> nodes = this.table[hash(key)];
        for (Solution.Node node : nodes) {
            if(key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }

    public String solution(String[] participant, String[] completion) {
        Solution solution = new Solution(participant.length);
        for(int i = 0; i < participant.length; i++) {
           solution.insert(participant[i], hash(participant[i]));
           solution.insert(completion[i], hash(completion[i]));
        }


    }


}

package data_structure.Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndString;

    public TrieNode() {
        children = new HashMap<>();
        isEndString = false;
    }
}

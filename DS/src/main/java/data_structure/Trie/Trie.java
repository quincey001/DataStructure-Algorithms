package data_structure.Trie;

public class Trie {
    /**
     * a trie is a tree-based data structure that organizes information in a hierarchy.
     * properties:
     * it is typically used to store or search strings in a space and time efficient way
     * any node in trie can store non-repetitive multiple characters
     * every node stores link of the next character of the string
     * every node keeps track of end of string.
     *
     * why we need trie?
     * to solve many standard problems in efficient way
     * - spelling checker
     * - auto-completion in google chrome
     */
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
        System.out.println("trie created");
    }

    public void insert(String words){
        TrieNode current = root;
        for(int i = 0; i < words.length(); i++){
            char ch = words.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.isEndString = true;
        System.out.println("insert " + words + "to trie successful!!");
    }

    public static void main(String[] args){
        Trie newTrie = new Trie();
        newTrie.insert("hello");
    }
}

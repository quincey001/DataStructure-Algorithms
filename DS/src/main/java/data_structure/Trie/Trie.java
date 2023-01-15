package data_structure.Trie;

public class Trie {
    /**
     * a trie is a tree-based data structure that organizes information in a hierarchy.
     * properties:
     * it is typically used to store or search strings in a space and time efficient way
     * any node in trie can store non-repetitive multiple characters
     * every node stores link of the next character of the string
     * every node keeps track of end of string.
     * insert and search method both take T(n) time complexity
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
            // first thing is to check is the char in string weather exists in current root's children.
            // if not, insert the char and a new node into current trie node
            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.isEndString = true;
        System.out.println("insert " + words + " to trie successful!!");
    }

    public boolean search(String words){
        TrieNode current = root;
        for(int i = 0; i < words.length(); i++){
            char ch = words.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                System.out.println( words + " string does not exist in this trie");
                return false;
            }
            current = node;//move to children
        }
        if(current.isEndString == true){
            System.out.println(words + " string exists in this trie");
            return true;
        }else{
            System.out.println(words + " string does not exist in this trie, but it is a prefix of the Trie");
        }
        return current.isEndString;
    }



    public static void main(String[] args){
        Trie newTrie = new Trie();
        newTrie.insert("hello");
        newTrie.search("hel");
    }
}

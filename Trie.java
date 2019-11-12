package com.company;

public class Trie {

    private TrieNode root;

    public Trie (){
        root = new TrieNode(null);
        root.children = new TrieNode[52];
    }

    public void insert(String input){
            TrieNode tmp = root;

            for (int j = 0; j < input.length(); j++){
                char add = input.charAt(j);
                int index = (int)add;
                if (index >= 65 && index <= 90){
                    index = index - 65;
                }
                else{
                    index = index - 71;
                }
                if (tmp.children[index] == null) {
                    String s = Character.toString(add);
                    TrieNode insertion = new TrieNode(s);
                    tmp.children[index] = insertion;
                    tmp = insertion;
                }
                else
                    tmp = tmp.children[index];
            }
    }

    public boolean search(String input) {

        TrieNode tmp = root;
        for (int j = 0; j < input.length(); j++) {
            char add = input.charAt(j);
            int index = (int) add;
            if (index >= 65 && index <= 90) {
                index = index - 65;
            } else {
                index = index - 71;
            }
            if (tmp.children[index] != null) {
                tmp = tmp.children[index];
            } else
                return false;

        }
        return true;
    }
    public boolean startsWith(String input) {

        TrieNode tmp = root;
        for (int j = 0; j < input.length(); j++) {
            char add = input.charAt(j);
            int index = (int) add;
            if (index >= 65 && index <= 90) {
                index = index - 65;
            } else {
                index = index - 71;
            }
            if (tmp.children[index] != null) {
                tmp = tmp.children[index];
            } else
                return false;

        }
        return true;
    }
}

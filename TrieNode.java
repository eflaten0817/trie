package com.company;

public class TrieNode {

    private String letter;
    public TrieNode[] children;


    public TrieNode(String l){
       letter = l;
       children = new TrieNode[52];
    }
}

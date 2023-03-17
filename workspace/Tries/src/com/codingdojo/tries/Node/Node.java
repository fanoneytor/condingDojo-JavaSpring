package com.codingdojo.tries.Node;

import java.util.HashMap;
public class Node {
    public HashMap<Character, Node> children;
    public boolean isCompleteWord;
    
    public Node() {
        this.children = new HashMap<Character, Node>();
        this.isCompleteWord = false;
    }
}


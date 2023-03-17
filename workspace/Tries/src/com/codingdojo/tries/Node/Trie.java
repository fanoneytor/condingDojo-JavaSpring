package com.codingdojo.tries.Node;

public class Trie {
    public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // obtiene el nodo raíz;
        Node currentNode = this.root;
        
        // itera sobre cada carácter de la palabra
        for(int i = 0; i < word.length(); i++) {
            // currentLetter es solo el carácter/letra en la iteración
            Character currentLetter = word.charAt(i);
            // pregunta si la letra actual está en el mapa del nodo actual
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }    
    
    boolean isPrefixValid(String prefix) {
    	Node currentNode = this.root;
    	
    	for(int i=0; i<prefix.length(); i++) {
    		
    	}
    	return true;
    }
}


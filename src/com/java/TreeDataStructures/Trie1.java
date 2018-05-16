package com.java.TreeDataStructures;

import java.util.ArrayList;

import java.util.List;



public class Trie1 {
	
	private TrieNode root;
	private Trie1(){
	root = new TrieNode(' ');
	}
	
	 
    public void insert(String word)
    {
        if (search(word)) 
            return;  
        
        TrieNode current = root; 
        for (char ch : word.toCharArray() )
        {
            TrieNode child = current.subNode(ch);
            if (child != null)
                current = child;
            else 
            {
                 current.childList.add(new TrieNode(ch));
                 current = current.subNode(ch);
            }
            current.count++;
        }
        current.isEnd = true;
    }

    public boolean search(String word)
    {
        TrieNode current = root;  
        for (char ch : word.toCharArray() )
        {
            if (current.subNode(ch) == null)
                return false;
            else
                current = current.subNode(ch);
        }      
       
        return true;
    }
    
	
	public void remove(String word){
		
		if(!search(word)){
			System.out.println("word is not present");
			return;
		}
		TrieNode current = root;
		
		for (Character ch : word.toCharArray()) {
			TrieNode child = current.subNode(ch);
			
			if(child.count ==1){
				child.childList.remove(child);
				return;
				
			}else{
				child.count--;
				current = child;
			}
		}
		
	}
	
	class TrieNode{
		Character content;
		Boolean isEnd;
		Integer count;
		List<TrieNode> childList;
		
		TrieNode(char ch){
			content =ch;
			isEnd = false;
			count= 0;
			childList = new ArrayList<TrieNode>();
			
		}
		
		public TrieNode subNode(char c)
	    {
	        if (childList != null)
	            for (TrieNode eachChild : childList)
	                if (eachChild.content == c)
	                    return eachChild;
	        return null;
	    }
		
	}
	
	

	
	
	
	
	public static void main(String[] args) {
		
		
		Trie1 t = new Trie1();
		
		String str = "BANANA";
		
	for (int i = str.length() -1; i>=0; i--) {
		
		t.insert(str.substring(i));
		System.out.println(str.substring(i));
		
	}
		
		
		
		System.out.println(t.search("AN"));
		System.out.println(t.search("ANANA"));
		System.out.println(t.search("EA"));
		

	
	}

}

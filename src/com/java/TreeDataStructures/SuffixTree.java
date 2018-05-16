package com.java.TreeDataStructures;

import java.util.ArrayList;
import java.util.List;


public class SuffixTree {
	
	private TrieNode root;
	private String str;
	
	private SuffixTree(){
	root = new TrieNode(' ');
	}
	
	 
    public void insert(String word)
    {
        if (search(word)) 
            return;  
        
        Integer index = str.length()-word.length();
        
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
            current.index = index;
            index++;
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
            
            System.out.println(current.index);
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
		Integer index;
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
		
		
		SuffixTree t = new SuffixTree();
		
		t.str = "BANANAS";
		
	for (int i = t.str.length() -1; i>=0; i--) {
		
		t.insert(t.str.substring(i));
		System.out.println(t.str.substring(i));
		
	}
		
		
		
		System.out.println(t.search("ANANA"));
		System.out.println(t.search("e*h"));
		System.out.println(t.search("war"));
		System.out.println(t.search("er"));
		


	

	
	}

}

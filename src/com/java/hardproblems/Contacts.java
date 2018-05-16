package com.java.hardproblems;

import java.util.*;




public class Contacts {
    
    TrieNode root;
    
    Contacts(){
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
        if (current.isEnd) 
            return true;
        return false;
    }
    
    
    
    class TrieNode{
        
        private Character content;
        Boolean isEnd;
        Integer count;
        List<TrieNode> childList;
        
        TrieNode(Character ch){
            this.content = ch;
            this.isEnd = false;
            this.count = 0;
            this.childList = new ArrayList<TrieNode>();
            
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
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        Contacts s = new Contacts();
//        for(int a0 = 0; a0 < n; a0++){
//            String op = in.next();
//            String contact = in.next();
//            
//            if(op.equalsIgnoreCase("add"))
//                s.insert(contact);
//            else if (op.equalsIgnoreCase("find"))
//            	System.out.println(s.find(contact));
//            	
//            
//        }
//        in.close();
    	int[] a = new int[]{3,2,1,3,2};
    	
    	System.out.println(lonelyInteger(a));;
    }

	private int find(String contact) {
		
		
		 TrieNode current = root;
	        for(Character ch :contact.toCharArray()){
	            TrieNode child = current.subNode(ch);
	            
	            if(child == null){
	                return 0;
	                
	            }else{
	                current = child;
	            }
	            
	        }
		
		
		return current.count;
	}
	
	 public static int lonelyInteger(int[] a) {
	        
	        int result = 0;
	        
	        for(int i : a) {
	            result = result ^ i;
	            System.out.println(result);
	        }
	        
	        return result;
	    }

}

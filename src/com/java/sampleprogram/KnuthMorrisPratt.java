package com.java.sampleprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * This class implements KMP algorithm for finding length of maximal prefix-suffix for each prefix of the string.
 * Prefix-suffix of string S is a substring which occurs at the beginning and at the end of S.
 * <p>
 * Time complexity: O(n) <br>
 * <p>
 * @see <a href="https://en.wikipedia.org/wiki/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm">Knuth Morris Pratt (Wikipedia)</a>
 * <br>
 * @author Szymon Stankiewicz <mail@stankiewicz.me>
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class KnuthMorrisPratt {

    private KnuthMorrisPratt() {}

    /**
     * This function implements KMP algorithm for finding length of maximal prefix-suffix for each prefix of the string.
     * Prefix-suffix of string S is a substring which occurs at the beginning and at the end of S.
     * <p>
     * @param text Text
     * @return maximal length of prefix-suffix for each prefix of the string text
     */
    public static List<Integer> getPrefSufTable(String text) {

        final List<Integer> prefSufTable = new ArrayList<Integer>();
        final char[] chars = text.toCharArray();

        if (text.length() == 0) 
            return prefSufTable;

        prefSufTable.add(0);

        for (int i = 1; i<chars.length; i++) {
            int sizeOfPrefSuf = prefSufTable.get(i-1);
            while (sizeOfPrefSuf > 0 && (chars[i] != chars[sizeOfPrefSuf]))
                sizeOfPrefSuf = prefSufTable.get(sizeOfPrefSuf-1); // because string is 0-indexed

            // if characters at this positions are different then sizeOfPrefSuf is equal to zero,
            // so there is no proper prefix-suffix
            if (chars[i] == chars[sizeOfPrefSuf]) {
                prefSufTable.add(sizeOfPrefSuf+1);
            } else {
                prefSufTable.add(0);
            }
        }
        return prefSufTable;
    }
    
    public static void main(String args[]){
    	
    	
    	
    	String str = "abcabcabcabc";
    	
    	List<Integer> list = getPrefSufTable(str);
    	System.out.println(list);
    	
    	String subString = "";
    	int greater =0;
    	
    	for (Integer integer : list) {
			
    		if(integer >greater)
    			greater = integer;
		}
    	
    	boolean reRun = false;
    	if(str.length()/2 <= greater)
    		reRun =true;
    	
    	
    		
    	if(reRun){
    	for (int i = 0; i < list.size(); i++) {
    		int integer=list.get(i);
			
    		if(integer != 0)
				subString += str.charAt(i)+"";
		}
		}
			
    	
    	
    	System.out.println(subString);
    	
    	
    	List<Integer> suList = getPrefSufTable(subString);
    	String ssstr = "";
    	
    	for (int i = 0; i < suList.size(); i++) {
    		int integer=suList.get(i);
			
    		if(integer != 0)
				ssstr+= subString.charAt(i)+"";
		}
    	
    	System.out.println(ssstr);
    	
    	String[] strArr = new String[ssstr.length()];
    	int j=2;
    	int l=0;
    	for (int i = 2; i < str.length(); i+=3) {
    		System.out.println(i);
    		strArr[l] = str.substring(i-j, i);
			l++;
		}
    	
    	System.out.println(strArr.length);
//    	String aS = "abcabc";
//    	String s = "";
//    	
//    	Integer[] a = getPrefSufTable("ABCDABCDABC").toArray(new Integer[getPrefSufTable("ABCDABCDABC").size()]);
//    	
//    	System.out.println(a.length);
//    	
//    	for (int i = 0; i < a.length; i++) {
//    		if(a[i]>0){
//    			s+=aS.charAt(a[i]-1);  			
//      		}
//			
//		}
//    	System.out.println(s);
//    	
//    	String m = "abcabcabc";
//    	
//    	String[] strarr = m.split("abc");
//    	
//    	System.out.println(strarr.length);
//    	
//    	for (int i = 0; i < strarr.length; i++) {
//			System.out.println(strarr[i]);
//		}
    }
}

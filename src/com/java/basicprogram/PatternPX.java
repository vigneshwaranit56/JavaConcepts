package com.java.basicprogram;


public class PatternPX
{
public static void incrementPatternPrint(int start,int n)
{

for(int i =0;i<2*n;i++){
 
 if(i<n){
     for(int j =0;j<=i;j++){
       System.out.print(start);
     }
     start++;
     System.out.println();
     
 }else{
     if(i==n)
     start--;
     
     for(int k =2*n-i-1;k>=0;k--){
       System.out.print(start);

     }
     start--;
     System.out.println();
 }
 
}

}

public static void main(String args[]){
	incrementPatternPrint(3, 4);
}
//METHOD SIGNATURE ENDS
}

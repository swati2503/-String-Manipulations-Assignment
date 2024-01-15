package com.str.utility;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		char first=str.charAt(0);
		char last=str.charAt(str.length()-1);
		String ans="";
		
		ans+=last;
		
		for(int i=1;i<str.length()-1;i++)
			ans+=str.charAt(i);
		
		ans+=first;
		System.out.println(first+" "+last);
		System.out.println(ans);
		
		System.out.println(maxString("How are you"));
		
		System.out.println(returnFirstChar("Softra Services Limited"));
		System.out.println(returnIndexWise("Softra Services Limited"));
	}
	
	public static String maxString(String str) {
		String ans="";
		String arr[]=str.split(" ");
		int maxlen=0;
		for(int i=0;i<arr.length;i++)
		{
			if(maxlen<arr[i].length()) {
				ans=arr[i];
				maxlen=arr[i].length();
			}
				
		}
		
		return ans;
	}
	
	public static String returnFirstChar(String str) {
		String arr[]=str.split(" ");
		String ans="";
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i].charAt(0);
		}
		return ans;
	}
	
	public static String returnIndexWise(String str) {
		String arr[]=str.split(" ");
		String ans="";
		int count=0;
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i].charAt(count);
			count++;
		}
		
		return ans;
	}

}

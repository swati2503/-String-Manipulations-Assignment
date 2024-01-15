package com.str.utility;

public class AppendString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcxXXcxerxxXXwer";
		int count=0;
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='x')
				count++;
			else
				ans+=str.charAt(i);
		}
		
		for(int i=0;i<count;i++)
			ans+='x';
		
		System.out.println(ans);
	}

}

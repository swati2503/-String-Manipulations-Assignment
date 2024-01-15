package com.str.utility;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="computer";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			if(i!=0)
				System.out.print("-");
		}
	}

}

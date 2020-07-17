package org.gitproject;

public class ProgectGit5 {
	public static  int c; 
	public ProgectGit5(){
	System.out.println("construter");	
	}
		public void select() {
		int a=10;
		int b=220;
		 c=a+b;
		
	}
	public static void main(String[] args) {
		
		ProgectGit5 pg = new ProgectGit5();
		pg.select();
		System.out.println(c);
	}

}

package com.ChapterOne;

public class QuestionNo3 {
	/*public static void doStuff(int... args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
	}*/
		
	public static  void doStuff1(int x,int... doargs) {
		System.out.println(x);
		for(int i=0;i<doargs.length;i++) {
			//System.out.println(this.x);
			System.out.println(doargs[i]);
		}
	}

	public static void main(String[] args) {
		/*doStuff(1);
		doStuff(1,2);*/
		doStuff1(1);
		doStuff1(1,2);

	}

}

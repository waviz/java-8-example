package com.ChapterOne;

enum Animals{
	DOG("woof"), CAT("meuo"),FISH("burble");
	String sound;
	Animals(String s){
		sound = s;
	}
}
public class QuestionNo4TestEnum {
static Animals a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(a.DOG.sound+" "+a.FISH.sound);

	}

}
//      Output is
//        woof burble
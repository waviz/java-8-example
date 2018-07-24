package com.ChapterOne;

public class QuestionNo6  implements Device{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}

}
abstract class Phone extends QuestionNo6{
	
}
abstract class Phone1 extends QuestionNo6{
	public void doIt(int x) {
		
	}
}
class Phone3 extends QuestionNo6 implements Device{
	public void doStuff() {
		
	}
}
interface Device{
	public void doIt();
}


//      OutPut  

//     Compilation Succes
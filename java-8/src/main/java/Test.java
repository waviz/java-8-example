 

public class Test  extends Test2{
	//static String s="";
	
	private Test() {
		s += "Krishna Mohan";
	}
	


	public static void main(String[] args) {
		new Test();
	System.out.println(s);
		
	}
}
class Test1 extends Test2{
static String s="";
	
	private  Test1() {
		s += "mohan1";
	}
	}
class Test2 {
static String s="";
	
	protected Test2() {
		s += "krishna1";
	}
}
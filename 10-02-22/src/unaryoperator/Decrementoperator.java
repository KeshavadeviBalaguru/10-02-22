package unaryoperator;

public class Decrementoperator {

	public static void main(String[] args) {
		int a=7;
		System.out.println("postdecrement"); 
		System.out.println(a--);//7
		//6
		
		System.out.println("predecrement"); 
		System.out.println(--a);//5
		
		System.out.println(a-- + --a);//5+3
	}

}

package unaryoperator;

public class Increment_operator {

	public static void main(String[] args) {
		int a=3;
		System.out.println("postincrement"); 
		System.out.println(a++);//3
		//4
		
		System.out.println("preincrement"); 
		System.out.println(++a);//5
		 
		System.out.println(a++ + ++a);//5+7
	}

}

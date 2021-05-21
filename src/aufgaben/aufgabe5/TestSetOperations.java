package aufgaben.aufgabe5;

public class TestSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test fillBothUnion() + print()
		
		SetOperations union = new SetOperations();
		union.fillBothUnion();
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("          A                                         B                                        A OR B ");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println();
		union.print();
		
//		Test fillBothIntersection()
		
		SetOperations intersection = new SetOperations();
		intersection.fillBothIntersection();
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("          A                                         B                                       A AND B ");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println();
		intersection.print();
		
//		Test fillBothDifference()
		
		SetOperations difference = new SetOperations();
		difference.fillBothDifference();
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("          A                                         B                                         A - B ");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println();
		difference.print();
		

	}

}


public class MyValueLBE {
	
	
		public static void main(String args[]) {
			
			MyNumber myValue;
			
			myValue=()->234.89;
			
			System.out.println("Interface Number = "+myValue.getValue());
			myValue=()->Math.random()*100;
			System.out.println("Random number = "+myValue.getValue());
			
			NumericTest numTest=(n)->n%2==0;
			
			if(numTest.testNum(20))
			System.out.println("Equla ");
			
			if(numTest.testNum(21))
			System.out.println("Non equal");
			
			numTest=(n)-> n >= 0;
			
			if(numTest.testNum(21))
				System.out.println("positive ");
			
			if(numTest.testNum(-3))
				System.out.println("Negatives");
		}

}

interface MyNumber{
	double getValue();
}

interface NumericTest{
	boolean testNum(int n);
}

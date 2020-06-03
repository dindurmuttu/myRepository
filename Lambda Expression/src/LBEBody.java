
public class LBEBody {
	public static void main(String[] args) {
		NumericalFactors numFact;
		
		numFact=(g,str)->{
			
			int result=1;
			String srt="";
			
			for(int i=1; i<=g; i++)
				result=i*result;
			
				for(int s=str.length()-1; s > -1; s--)
					srt=srt+str.charAt(s);
			
			return srt+" factors "+result;
						
		};
		System.out.println("Factor of number = "+numFact.getFactValue(3,"reverse"));
		System.out.println("Factor of number = "+numFact.getFactValue(5,"muttu"));		
		
	}

}

interface NumericalFactors{
	String getFactValue(int n, String str);
}

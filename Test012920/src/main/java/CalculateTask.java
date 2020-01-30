
public class CalculateTask {
	
	public static void verifySumNumber(int [] a, int sum) {
		//int [] array = {100,200,100,400};
		int ab = 0;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i] + a[j]==sum) {
					System.out.println("condition is true");
					ab=sum;
					break;
					
				}	
			}
			if(ab==sum) {
				break;
			}
		}
	}

}

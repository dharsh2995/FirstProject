package array;

public class Duplicates {

	public static void main (String[] args) {
	
		int a[] = {10,10,20,50,60,80,60,50};
		
	
		for (int i=0; i<a.length; i++) {
			int d =0;
		for (int j=i+1; j<a.length; j++) {
				
		if (a[i] == a[j] ) {
						
			d++;
			}
	}
			if (d==0) {
				
				
				System.out.print(a[i]+" ");
		
			}
		}
}
}
		
		
			
	
	

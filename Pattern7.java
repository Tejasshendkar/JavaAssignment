package pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int star1=5,star2=5,i,j,k;
		for(i=0;i<6;i++) {
			
			   for(j=0;j<11;j++) {
				if(j==star1 || j==star2 ||i==5) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			star1--;
			star2++;
			System.out.println();
		}

	}

}

package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int i,j,space=0,star=5,k;
		for(i=0;i<5;i++) {
			for(j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(k=0;k<star;k++) {
				System.out.print("* ");
			}
			space++;
			star--;
			System.out.println();
		}

	}

}

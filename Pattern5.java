package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int star=1,space=5;
		for(int i=0;i<6;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<star;k++) {
				System.out.print("* ");
			}
			space--;
			star++;
			System.out.println();
		}
	}

}

package pattern;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i=1;i<4;i++) {
			for(int j=1;j<6;j++) {
				if(i==1 || j==1 || j==5 || i==3)
				   System.out.print(" * ");
			}
			System.out.println();
		}

	}

}

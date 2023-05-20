
public class Main {
public static void main(String[] args) {
	double s=1;
	for(int i=2; i<=100; i++) {
		s += s/i;
	}
	System.out.printf("%.2f",s);
} // main
} //class

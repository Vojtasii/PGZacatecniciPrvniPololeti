public class KvadratickaRovnice {
    public static void main(String[] args) {
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	double disk = (b*b - 4*a*c);
//	System.out.printf("%.2f", disk);
	if (disk < -0.0001) {
	    System.out.printf("Kvadraticka rovnice nema reseni"); }
	else if ( disk < 0.0001) {
	    double res = -b / 2*a;
	    System.out.printf("Jedine reseni rovnice je %2.2f\n", res);
	}
	else if (disk >= 0.0001) {
	    double res1 = ((-b + Math.sqrt(disk)) / 2*a);
	    double res2 = ((-b - Math.sqrt(disk)) / 2*a);
	    System.out.printf("Jedno reseni rovnice je %2.2f\n", res1);
	    System.out.printf("Druhe reseni rovnice je %2.2f\n", res2);
	}
    }
}
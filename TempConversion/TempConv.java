public class TempConv{

    public static double CtoF(double t){
	return (9.0/5.0) * t + 32.0;
    }

    public static double FtoC(double t){
	return (t - 32.0) * (5.0/ 9.0);
    }

    public static void main(String[]args){
	System.out.println(CtoF(100));
	System.out.println(CtoF(0));
	System.out.println(CtoF(50));
	System.out.println(FtoC(0));
	System.out.println(FtoC(212));
	System.out.println(FtoC(100));
    }

}

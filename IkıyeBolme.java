
public class IkýyeBolme {
	final static double sayi=3;
	static double f(double x){
		return Math.pow(x, 2)-sayi;
	}
	static double hata(double eski,double yeni){
		return (yeni-eski)/yeni*100;
	}
	public static void main(String[] args) {

		double a=0,u=sayi,er,yr=(a+u)/2,h=0.001;
		
		int i=0;

		if (f(a)*f(u) < 0) {
			
			while (true) {
				i++;
				er=yr;	
				yr=(a+u)/2;
				System.out.println("Ýtersayon\t: "+i);
				System.out.println("a\t: "+a);
				System.out.println("u\t: "+u);
				System.out.println("r\t: "+yr);
				System.out.println("f(a)\t: "+f(a));
				System.out.println("f(u)\t: "+f(u));
				System.out.println("f(r)\t: "+f(yr));
				if(f(a)*f(yr) < 0)
					u=yr;
				else if(f(a)*f(yr) > 0)
					a=yr;
				else
					break;
				if(i>1){
					System.out.println("hata\t: "+hata(er,yr));
					if (Math.abs(hata(er,yr))<h)
						break;
				}
			}
		}
		System.out.println(yr);
	}
}
 

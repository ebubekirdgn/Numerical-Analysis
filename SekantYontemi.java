
public class SekantYontemi 
{
	  //Fonksiyonun normal hali = f(x) = e^-x-x
    public static double f (double x)
    {
        return (Math.pow(Math.E, -x)-x);
    }
    public static double Hata(double eski , double yeni)
    {
	return Math.abs((yeni - eski) / yeni)*100;
    }
 
    public static void yazdir()
    {
    	System.out.format("%-16s","İterasyon");
		System.out.format("%-16s","Xi");
		System.out.format("%-16s","Xi+1");
		System.out.format("%-16s","f(Xi)");
		System.out.format("%-16s","Hata");
		System.out.format("%-16s%n","Durum");
    }
    public static boolean yakınsama(double x1,double x2,double x3){
		
		if (Math.abs(x3-x2)<Math.abs(x2-x1))
			return true;
		else
			return false;
	}
    public static void main(String[] args) 
    {
	 int iterasyon=0;
     double  Sonraki,Onceki ,Xi,hata,d,hesapla;
     Xi=1.0;
     d=0.001;
     hata =0.01;
     Onceki=Xi; 
     yazdir();
     
     while (true)
     {
         iterasyon++;  
         hesapla = f(Xi+d*Xi);
         Sonraki = Xi -  d*Xi*(f(Xi) / (hesapla - f(Xi)));	 
         
         System.out.format("%-16s",iterasyon);
         System.out.format("%-16.8f",Xi);
         System.out.format("%-16.8f",Sonraki);
         System.out.format("%-16.8f",f(Xi));
         System.out.format("%-16.8f",Hata(Xi,Sonraki));
         
         if(iterasyon>1)
         {
				System.out.format("%-16s", yakınsama(Onceki,Xi,Sonraki) ? "Yakınsama" : "Iraksama");
		 }
         
         if(iterasyon>20 || Hata(Xi,Sonraki)<hata)break;
          
        	 Onceki = Xi;
        	 Xi=Sonraki;
        	 System.out.println();
      }
   }
}

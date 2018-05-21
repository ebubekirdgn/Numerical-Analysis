
public class NewtonRaphsonMethod 
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

        // Turev = f'(x) = 3- e^x + cos (x)
        public static double f_Turev (double x)
        {
            return (-Math.pow(Math.E, -x)-1);
        }
        public static void yazdir()
        {
        	System.out.format("%-16s","İterasyon");
    		System.out.format("%-16s","Xi");
    		System.out.format("%-16s","Xi+1");
    		System.out.format("%-16s","f(xi)");
    		System.out.format("%-16s","f_Turev(Xi) ");
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
         double  Sonraki,Onceki ,Xi,hata;
         Xi=0;
         hata =0.01;
         Onceki=Xi; 
         yazdir();
         
         while (true)
         {
	         iterasyon++;  
	         
	         Sonraki = Xi -  (f(Xi) /f_Turev(Xi));	 
	         
	         System.out.format("%-16s",iterasyon);
	         System.out.format("%-16.8f",Xi);
	         System.out.format("%-16.8f",Sonraki);
	         System.out.format("%-16.8f",f(Xi));
	         System.out.format("%-16.8f",f_Turev(Xi));
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
 


public class Bonus {
	  public static double Us_Alma(double taban ,int us)
		 {	
			  double sonuc=1;
			  for(int i=1;i<=us;i++)
			  {
				  sonuc *= taban;
			  }
			 return sonuc;
		 }

		  public static double f_functions(double x)
			 {
				 return Us_Alma(x,2)-3;
			 }
		 
		  static void EkranaYazdir(double Xa,double Xu,double Xr,int Iterasyon)
		 {
				System.out.println("Ýtersayon : " + Iterasyon);
				System.out.printf("Xa        :%.7f \n"  , Xa);
				System.out.printf("Xu        :%.7f \n" , Xu);
				System.out.printf("Xr        :%.7f \n" , Xr);
				System.out.printf("f(Xa)     :%.7f \n" , f_functions(Xa));
				System.out.printf("f(Xu)     :%.7f \n" , f_functions(Xu));
				System.out.printf("f(Xr)     :%.7f \n" , f_functions(Xr));
		 }
		 
		public static void main(String[] args) 
		{
			double Xa,Xu,gecici,Xr;
			int Iterasyon = 0 ;
		    Xa=0;
		    Xu=3;
		    
		    Xr=(Xa+Xu)/2;
		 
			if (f_functions(Xa)*f_functions(Xu) < 0) 
			{
				while (Iterasyon<5) 
				{
					 Iterasyon++;
					 gecici = Xr;	
					 Xr = (Xa+Xu)/2;
					 EkranaYazdir(Xa, Xu, Xr, Iterasyon);
					 if(f_functions(Xa)*f_functions(Xr) < 0)
					 	Xu=Xr;
					 else if(f_functions(Xa)*f_functions(Xr) > 0)
					 	Xa=Xr;
					 System.out.printf("Son bulunan kök :  %.7f \n" , Xr);
				 }
				
			}
			
			 
			//Burasý aslýnda kök 3'ün yaklaþýk deðeridir.
		}
	}
	 
	 

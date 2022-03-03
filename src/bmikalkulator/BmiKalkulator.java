package bmikalkulator;

import java.util.Scanner;

public class BmiKalkulator 
{

    public static void main(String[] args) 
    {
        
        cim("BMI index kiszámítása");
        
        int tomeg=beker("Testtömeg (kg) [40 - 150]: ", 40, 150);
        int magassag=beker("Testmagasság (cm) [100 - 200]: ", 100, 200);
        
        double bmiindex = bmi(tomeg, magassag);
        
        ertekeles(tomeg, magassag, bmiindex);
        
    }

    private static void cim(String szoveg) 
    {
        System.out.println(szoveg);
    }

    private static int beker(String kerdes, int also, int felso) 
    {
        System.out.print(kerdes);
        
        Scanner sc = new Scanner(System.in);
        int szam=-1;
        boolean jo=false;
        
        while (!jo) 
        {
            szam=sc.nextInt();
            jo = szam >= also && szam <=felso;
            if(!jo)
            {
                System.out.println("Nem jó, újra!");
                System.out.println(kerdes);
            }
        }
        return szam;
    }

    private static double bmi(int tomeg, int magassag) 
    {
        return tomeg/Math.pow(magassag/100.0, 2);
    }

    private static void ertekeles(int tomeg, int magassag, double bmiIndex) 
    {
        String testalkat="túlsúlyos";
        System.out.printf("Ön %d cm magas és %d kg tömegű,"
                + "így BMI indexe %.1f,"
                + "Tehát Ön %s testalkatú.\n",tomeg, magassag, bmiIndex, testalkat);
    }
    
}

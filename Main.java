 
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
     public static void main(String args[])
    {
       /*System.out.println(Calculator.info);
       
       Calculator calculator1 = new Calculator();
       Calculator calculator4 = new Calculator();
       Calculator calculator2 = new Calculator(3,5);
       Calculator calculator3 = new Calculator(3);
       
       System.out.println("Nilai awal setelah konstruktor dipanggil");
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);
       
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
       
        System.out.println("");
       System.out.println(Calculator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       double hasil2 = calculator1.jumlah(3.4, 5.4);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);
       
       System.out.println("");
       double kurang1 = calculator1.kurang();
       double kurang2 = calculator1.kurang(3.4, 5.4);
       System.out.println("Hasil pengurangan method kurang tanpa parameter: "+ kurang1);
       System.out.println("Hasil pengurangan method kurang dengan parameter: "+ kurang2);

       System.out.println("");
       double kali1 = calculator1. kali();
       double kali2 = calculator1.kali(3.4, 5.4);
       System.out.println("Hasil perkalian method kali tanpa parameter: "+ kali1);
       System.out.println("Hasil perkalian method kali dengan parameter: "+ kali2);
       
       System.out.println("");
       double bagi1 = calculator1. bagi();
       double bagi2 = calculator1.bagi(3.4, 5.4);
       System.out.println("Hasil pembagian method bagi tanpa parameter: "+ bagi1);
       System.out.println("Hasil pembagian method bagi dengan parameter: "+ bagi2);
       
       calculatorprogrammer clp= new calculatorprogrammer();
       System.out.println(" \n calculatorprogrammer");
       System.out.println(" bentuk biner dari desimal" + " :"+ Integer.toBinaryString(4));
       System.out.println(" bentuk hex dari desimal" + " :"+ Integer.toHexString(4));
       
       calculatorscientific cs = new calculatorscientific();
       System.out.println(" \n Calculatorscientific");
       System.out.println("Faktorial dari 6! adalah" + cs. menghitungFaktorial(5));
       System.out.println("luas lingkarannya adalah" + cs.luas());
       System.out.println("luas Bujur sangkar adalah" + cs.bujurSangkar(10));
      
       
       CalculatorTrigonometri  clr = new CalculatorTriRadian();
       CalculatorTrigonometri  cld = new CalculatorTriDegree();
       
       System.out.println(" \n CalculatorTrigonometri"); 
       System.out.println("nilai dari sin adalah" + Math.sin(45));
       System.out.println("nilai dari cos adalah" + Math.cos(8));
       System.out.println("nilai dari tan adalah" + Math.tan(16));
    
       System.out.println("Nilai dari derajat sudut untuk PI/6 adalah " + Math.toDegrees(Math.PI/6) + " derajat");  
       System.out.println("Nilai dari sudut radian untuk sudut 30 derajat adalah " + Math.toRadians(30));
       */
    

       Calculator cl = new Calculator();
       SimpanOperasiCalculator  spr = new SimpanOperasiKeMemoryReverse ();
      
      
      cl.setSimpanOperasi(spr);
      cl.op1 = 1;
      cl.op2 = 1;
      System.out.println(cl.jumlah());
      
      cl.op1 = 2;
      cl.op2 = 2;
      System.out.println(cl.jumlah());
      
      cl.op1 = 3;
      cl.op2 = 3;
      System.out.println(cl.jumlah());
      System.out.println("Data dari memori: ");
      System.out.println(cl.bacaOperasi());
      
      SimpanOperasiCalculator spf = new  SimpanOperasiMemoryForwad();
      cl.setSimpanOperasi(spf);
      cl.op1 = 1;
      cl.op2 = 1;
      System.out.println(cl.jumlah());
      
      cl.op1 = 2;
      cl.op2 = 2;
      System.out.println(cl.jumlah());
      
      cl.op1 = 3;
      cl.op2 = 3;
      System.out.println(cl.jumlah());
      System.out.println("Data dari memori: ");
      System.out.println(cl.bacaOperasi());
    
    }
}
    
    

//import java.math.BigInteger;
import java.util.Random;

public class racer{
	static double units;
	 static double total_units; 
	
	 static double totalunit1;

	 static double turns; 
	 static double totalturns;
	 double spaces; 
	 
	public double move(){
		return units; 
	}
	 
	
	
}

class Racer1 extends racer{
	 
	 
	 
	 public double spaces(){
		 
		 //creates a random speed form 3 to 7 for racer 1
		 Random rac1speed= new Random();
		 //turns++;
		 //System.out.println("here!");
		 units=rac1speed.nextInt((7-3)+1)+3;
		 System.out.println("I am have gone up  "+units+" spaces");
		 
		// turns++;
		 
		 return units;
		 //generat
		
		 
		 
	 }
	 
	 public double move1(double units){
		
		
	
		
		
		 
		System.out.println("!!!");
		
		totalunit1=spaces();
		
		total_units= total_units+ totalunit1;
		
		System.out.println("total units" +total_units);
		System.out.println("I am now at spaces "+total_units);
			
		
	System.out.println("\n");
	
		turns++;
		
		
		return units;
	 }
	 
	public static void main(String args[]){
		//Racer1 rac1=new Racer1();
		//rac1.spaces();
		//rac1.spaces();
		
		//rac1.move1(units);
		
		//rac1.move1(units);
		//rac1.move1(units);
		
		//rac1.move1(units);
		
		//Racer3 rac3=new Racer3();
		//rac3.spaces(turns);
		//rac3.move(units);
		//rac3.move(units);
		//rac3.move(units);
		
		//Racer4 rac4=new Racer4();
		//rac4.move(units);
		//rac4.move(units);
		//rac4.move(units);
		
		Racer2 rac2=new Racer2();
		//rac2.space(turns);
		rac2.move(units);
		rac2.move(units);
		rac2.move(units);
		
		
	}
}
 class Racer3 extends racer{
	 
	 //makes the racer move randomly between 1 and 50/2^i
	 public double spaces(double tur){
		 Random moveracer3= new Random();
		double spacesgone;
		
		//the distance the racer will move after each turn
		spacesgone= (50/Math.pow(2.0, tur));
		units=1+(spacesgone-1)*moveracer3.nextDouble();
		
		System.out.println("i am at "+units+" spaces");
		
		 //turns++;
		 return units;
		 
	 }
	 
	 public double move(double units){
		// if(turns==0){
		 turns=1;
		 total_units=spaces(turns);
		 System.out.println(""+total_units);
		 totalunit1=total_units+totalunit1;
			
			 //double spacesr3=spacer3;
			 System.out.println("I have now moved "+totalunit1+" spaces");
			 
		//}
		 turns++;
		 
		 return units;
	 }
	 
 }
 class Racer4 extends racer{
	
	 public double space(double turns){
		 if(turns%2==0){
			 units=4;
			 System.out.println("i have moved "+units+" spaces");
		 }
		 else{
			 units=8;
			 System.out.println("i have moved "+units+" spaces");
		 }
		 
		 return units;
	 }
	 
	 public double move(double units){
		 turns=0;
		 total_units=space(turns);
		 totalunit1=total_units+totalunit1;
			System.out.println("i am now  at "+totalunit1+"spaces");
		 turns++;
		 
		 return units;
	 }
 }
 class Racer2 extends racer{
	 public double space(double turns){
		  double perc=Math.random();
		  if(perc<0.2){
			  //Random rac2speed= new Random();
			  units=0;
			  //units=rac2speed.nextInt((14-6)+1)+6;
			  System.out.println("I have gone up "+units+" spaces");
			  
		  }else{
			  Random rac2speed= new Random();
			  units=rac2speed.nextInt((14-6)+1)+6;
			  System.out.println("I have gone up "+units+" spaces");
		  }
		  
		  
		  
				  		 
		 return units;
	 }
	 public double move(double units){
		 
		// turns=1;
		 total_units=space(turns);
		 totalunit1=total_units+totalunit1;
			System.out.println("i am now  at "+totalunit1+"spaces");
		 turns++;
		 return units;
	 }
 }
 
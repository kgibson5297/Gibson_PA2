import java.util.Scanner;
	public class Test {
	
		public static void main(String[] args) {
	
			double pounds,inches,kilograms,meters,BMI=0;
			Scanner input=new Scanner(System.in);
			System.out.println("Choose input for height and weight: \n1) lb./in. \n2) kg/m");
	
			int option=input.nextInt();
			switch(option)
			{
				case 1:System.out.println("Enter weight (lb.) :");
				pounds=input.nextDouble();
				System.out.println("Enter height (in.) :");
				inches=input.nextDouble();
				BMI= 703*pounds / (inches*inches);
				break;
	
				case 2:System.out.println("Enter weight (kilograms):");
				kilograms=input.nextDouble();
				System.out.println("Enter height (meters):");
				meters=input.nextDouble();
				BMI= kilograms / (meters*meters);
				break;
	
				default:System.out.println("Invalid Entry");
				break;
			}
			if(BMI<=18.5)
				System.out.println("BMI < 18.5 = UnderWeight");
				else if(BMI<=24.9)
					System.out.println("BMI between 18.5 - 24.9 = Healthy");
				else if(BMI<=29.9)
					System.out.println("BMI 25-29.9 = Overweight");
	
				else
					System.out.println("BMI >= to 30.0 = obese");
			}
	
			}
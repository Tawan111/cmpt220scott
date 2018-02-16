
public class Problem6_9 {

		public static void main(String[] args) {
			System.out.println("Feet  Meters   |   Meters   Feet");
			System.out.println(String.format("%35s", "").replace(' ', '-'));
			
			for(double feet = 1.0, meters = 20.0; feet <= 10.0; meters += 5, feet++) {
				
			System.out.printf("%4.1f  ", feet);
			System.out.printf("%5.3f", feetToMeter(feet));
			System.out.print("    |    ");
			System.out.printf("%-7.1f", meters);
			System.out.printf("%7.3f\n", meterToFeet(meters));
			
			}
		}
		
		public static double feetToMeter(double foot) {
			return 0.305 * foot;
		}

		public static double meterToFeet(double meter) {
			return 3.279 * meter;
		}
}

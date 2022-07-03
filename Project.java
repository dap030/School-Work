//Desmond Padilla -- CMIS242-6980 -- JULY 3, 2022
public class Project {
	
	public static void main(String[] args) {		
		//Totals: 541oz OR 32lbs, 29oz -- normalized to 33lbs 13oz //Avg: 180.33333333333334oz OR 11lbs 4.333o	
		Weight w1 = new Weight(11, 3); // 179oz total
		Weight w2 = new Weight(7, 20); // 132oz total -- normalized 8lbs, 4oz -- MIN
		Weight w3 = new Weight(14, 6); // 230oz total -- MAX
		
		System.out.print("Avg: " + findAverage(w1, w2, w3));
		System.out.print("\nMin: " + findMinimum(w1, w2, w3));
		System.out.print("\nMax: " + findMaximum(w1, w2, w3));
	}
	
	
	//minimum weight method
	private static Weight findMinimum(Weight w1, Weight w2, Weight w3) {		
		if(w1.lessThan(w2) && w1.lessThan(w3)) {
			return w1;		
		}
		else if(w2.lessThan(w3)) {
			return w2;
		}
		else {
			return w3;
		}
	}
	
	
	//maximum weight method
	private static Weight findMaximum(Weight w1, Weight w2, Weight w3) {
		if(!w1.lessThan(w2) && !w1.lessThan(w3)) {
			return w1;		
		}
		else if(!w2.lessThan(w3)) {
			return w2;
		}
		else {
			return w3;
		}
	}
	
	
	//average weight method
	private static Weight findAverage(Weight w1, Weight w2, Weight w3) {
		Weight sum = new Weight(0, 0);
		sum.addTo(w1);
		sum.addTo(w2);
		sum.addTo(w3);
		double avg = sum.toOunces() / 3;
		return new Weight(0, avg);
	}

}

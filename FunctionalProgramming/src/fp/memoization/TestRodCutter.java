package fp.memoization;

import java.util.Arrays;
import java.util.List;

public class TestRodCutter {

	public static void main(String[] args) {
		
		final List<Integer> priceValues = Arrays.asList(2,1,1,2,2,2,1,8,9,15);
		
		//final RodCutterBasic basicOverlappingRec = new RodCutterBasic(priceValues);
		final RodCutterMemo memoized = new RodCutterMemo(priceValues);
		
//		System.out.println("Basic:");
		 
//		Output.testSpeed("Max for 5", () -> System.out.println(basicOverlappingRec.maxProfit(5)));
//		Output.testSpeed("Max for 10", () -> System.out.println(basicOverlappingRec.maxProfit(10)));
//		Output.testSpeed("Max for 16", () -> System.out.println(basicOverlappingRec.maxProfit(17)));
				
		System.out.println("Memo:");
		System.out.println(memoized.maxProfit(5));
		System.out.println(memoized.maxProfit(22));
		System.out.println(memoized.maxProfit(38));
		System.out.println(memoized.maxProfit(60));
		System.out.println(memoized.maxProfit(60));
		
	}
}

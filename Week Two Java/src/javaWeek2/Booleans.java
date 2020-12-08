package javaWeek2;

public class Booleans {
	
	public static void main(String[] args) {
		
		// Three booleans are used below
		boolean isHotOutside = false;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		
		// Are used in the 4 booleans below
		double costOfMilk = 3.5;
		double moneyInWallet = 10;
		int thirstLevel = 3;
		
		/* Variables follow this criteria 
		   shouldByIcecream – this should be true if it is hot outside and there is money in your pocket
		   willGoSwimming – this should be true if it is hot outside and it is not a weekday
           isAGoodDay – this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
		   willBuyMilk – this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet is greater than or equal to 2 times the cost of milk. 
		*/
		boolean shouldByIcecream = isHotOutside && (moneyInWallet > 0);
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && (moneyInWallet > 0);
		boolean willBuyMilk = (thirstLevel >= 3) && (moneyInWallet >= 2 * costOfMilk);
		
	}

}

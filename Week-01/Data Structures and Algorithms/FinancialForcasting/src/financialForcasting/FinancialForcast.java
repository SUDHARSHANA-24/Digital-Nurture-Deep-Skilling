package financialForcasting;

public class FinancialForcast {
	public static double calculateFutureValue(double currentValue, double growthRate, int years) {

        // Base Condition
        if (years == 0) {
            return currentValue;
        }

        // Recursive Call
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double presentValue = 10000;
        double growthRate = 0.08; // 8%
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);

        System.out.printf("Present Value : %.2f%n", presentValue);
        System.out.printf("Growth Rate   : %.2f%%%n", growthRate * 100);
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : %.2f%n", futureValue);
    }
}



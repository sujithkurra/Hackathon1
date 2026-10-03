public class TotalWaterConsumption{
    static int totalWaterConsumption(int morningUsage, int eveningUsage){
        return morningUsage + eveningUsage;

    }
    public static void main(String[] args) {
     totalWaterConsumption(2000, 3888);
     System.out.println("Total water consumption: " + totalWaterConsumption(2000, 3888) + " Litres");
    }
}

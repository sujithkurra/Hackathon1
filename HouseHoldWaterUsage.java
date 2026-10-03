public class HouseHoldWaterUsage {
    public static void main(String[] args) {
        int numberOfPeople = 10;// Number of people in the household
        double waterUsage = 12.0;// water consumed in litres
        int HouseNo = 45677;// House number of the household
        char WaterUsageStatus = 'C';// Water usage status of the household * c means consumption is normal and e means excessive consumption

        System.out.println("House Number: " + HouseNo);
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Water Usage: " + waterUsage + " Litres");
        System.out.println("Water Usage Status: " + WaterUsageStatus);
    }
}

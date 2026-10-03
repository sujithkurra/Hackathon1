public class WaterBill {
    public static void main(String[] args){
        int consumption = 5000; // water consumed in litres   
        if(consumption > 500){
            int bill = 200;
            System.out.println("Water consumption: " + consumption + " Litres");
        System.out.println("Bill Amount: " + bill + " Rupees");
    }
        else{
        int bill = 100;
        System.out.println("Water consumption: " + consumption + " Litres");
        System.out.println("Bill Amount: " + bill + " Rupees");
        }
    }
}

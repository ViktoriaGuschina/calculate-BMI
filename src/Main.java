public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM2 = 1.87;
        int weightKg = 98;
        int bmi = service.calculate(heightM2, weightKg);
        System.out.println(bmi);
    }
}
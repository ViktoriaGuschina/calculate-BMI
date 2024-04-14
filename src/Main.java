public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM2 = 1.78;
        int weightKg = 65;
        int BMI = service.calculate(heightM2, weightKg);
        System.out.println(BMI);
    }
}
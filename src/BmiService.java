public class BmiService {
    public int calculate(double height, int weight) {
        height = height * height;
        int BMI = (int) (weight / height);
        return BMI;
    }
}

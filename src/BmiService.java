public class BmiService {
    public int calculate(double height, int weight) {
        double squareHeight = height * height;
        int bmi = (int) (weight / squareHeight);
        return bmi;
    }
}

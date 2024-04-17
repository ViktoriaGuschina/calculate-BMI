public class BmiService {
    public int calculate(double height, int weight) {
        double squareheight = height * height;
        int bmi = (int) (weight / squareheight);
        return bmi;
    }
}

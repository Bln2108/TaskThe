public class BmiService {
    public float calculate(int weight1, float height1) {
        float index1 = weight1 / (height1 * height1);
        return index1;
    }
}

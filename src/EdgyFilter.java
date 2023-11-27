public class EdgyFilter implements Filter{
    public void filter(PixelImage pi) {
        int[][] weights = {{-1, -1, -1}, {-1, 9, -1}, {-1, -1, -1}};
        pi.weightTransformations(weights, 1);
    }
}

public class LaplacianFilter implements Filter{
    public void filter(PixelImage pi) {
        int[][] weights = {{-1,-1,-1}, {-1, 8, -1}, {-1,-1,-1}};
        pi.weightTransformations(weights, 1);
    }
}

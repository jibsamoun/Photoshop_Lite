public class UnsharpMasking implements Filter {
    public void filter(PixelImage pi) {
        int[][] weights = {{-1, -2, -1}, {-2, 28, -2}, {-1, -2, -1}};
        pi.weightTransformations(weights, 16);
    }
}

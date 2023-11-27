import java.util.ArrayList;

public class GaussianFilter implements Filter{
    public void filter(PixelImage pi) {
        int[][] weights = {{1, 2, 1}, {2, 4, 2}, {1, 2, 1}};
        pi.weightTransformations(weights, 16);
    }
    }



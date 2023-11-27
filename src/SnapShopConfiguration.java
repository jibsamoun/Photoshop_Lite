// The first major problem we encountered while completing this project was figuring out the for loops that would only iterate over pixels that were not at the edge of the screen. At first we thought we could use data.length within using the nested for loops, but realized we must use ”getHeight() - 1” and “getWidth() - 1”
//Another tricky portion in regards to the arrays was constantly getting the “out of bounds” errors, which were very easy to get.

/**
 * A class to configure the SnapShop application
 *
 * Jibril Samoun
 * @version 03/10/2023
 */
public class SnapShopConfiguration {
    /**
     * Method to configure the SnapShop. Call methods like addFilter and
     * setDefaultFilename here.
     *
     * @param theShop
     *            A pointer to the application
     */
    public static void configure(SnapShop theShop) {

        theShop.setDefaultFilename("/Users/jibrilsamoun/Desktop/Images/k9.jpg");
        theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
        theShop.addFilter(new NegativeFilter(), "Negative Colors");
        theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
        theShop.addFilter(new GaussianFilter(), "Gaussian Blur");
        theShop.addFilter(new LaplacianFilter(), "Laplacian Filter");
        theShop.addFilter(new UnsharpMasking(), "Unsharp Masking Filter");
        theShop.addFilter(new EdgyFilter(), "Edgy Filter");
    }
}

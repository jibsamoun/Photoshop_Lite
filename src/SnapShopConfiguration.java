
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

package mediaone.Util;

import mediaone.SharedType.EProductType;

public class ProductUtil {

    public ProductUtil() {
    }

    public EProductType convertStringToEProductType(String productType) {
        if ("Film CD".equals(productType)) {
            return EProductType.FILMCD;
        } else if ("Music CD".equals(productType)) {
            return EProductType.MUSICCD;
        } else {
            return EProductType.BOOK;
        }
    }
}

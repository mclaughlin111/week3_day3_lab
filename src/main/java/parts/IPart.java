package parts;

import products.IProduct;

public interface IPart extends IProduct {
    // Interface can extend interfaces...
    String getManufacturer();
    long getPartNumber();
    void setManufacturer(String man);
    void setPartNumber(long num);
}

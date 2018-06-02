package vendor2;

import rates.Vendor;

public class VendorTwo implements Vendor {
    private VendorTwo(boolean preferred) {
        System.out.println("Vendor2 created");
    }

    public static VendorTwo provider() {
        return new VendorTwo(true);
    }

    @Override
    public String getName() {
        return "Vendor2";
    }

    @Override
    public int getRate() {
        return 2;
    }
}

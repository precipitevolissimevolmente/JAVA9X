package vendor1;

import rates.Vendor;

public class VendorOne implements Vendor {

    public VendorOne() {
        System.out.println("Vendor1 created");
    }

    @Override
    public String getName() {
        return "Vendor1";
    }

    @Override
    public int getRate() {
        return 1;
    }
}

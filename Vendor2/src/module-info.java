module VendorTwo {
    requires Rates;

    provides rates.Vendor with vendor2.VendorTwo;
}
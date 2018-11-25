package ratefinder;

import rates.Vendor;

import java.util.ServiceLoader;

public class RateFinder {
    public static void main(String[] args) {
        queryVendors();
    }

    private static void queryVendors() {
        //lazy evaluation
        ServiceLoader<Vendor> vendors = ServiceLoader.load(Vendor.class);
        System.out.println("Using ServiceLoader");

        for (Vendor vendor : vendors) {
            System.out.println(vendor.getName());
        }
        System.out.println("Iterating over Vendors:");

//        vendors.stream()
//                .filter(provider -> provider.type().getName().contains("Two"))
//                .map(provider -> provider.get())
//                .forEach(vendor -> System.out.println(vendor.getName()));
        System.out.println("Iterating over Providers:");
    }
}
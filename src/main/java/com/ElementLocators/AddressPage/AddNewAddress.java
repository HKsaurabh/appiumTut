package com.ElementLocators.AddressPage;

/**
 * Created by saurabh on 27/02/17.
 */
public class AddNewAddress {
    private static String addNewAddress = "com.urbanclap.urbanclap:id/layout_add_address_title";
    private static String houseNoText = "com.urbanclap.urbanclap:id/location_other";
    private static String landMarkTxt = "com.urbanclap.urbanclap:id/landmark";
    private static String saveBtn = "com.urbanclap.urbanclap:id/button_saveNewAddress";


    public static String getAddNewAddress() {
        return addNewAddress;
    }

    public static String getHouseNoText() {

        return houseNoText;
    }

    public static String getLandMarkTxt() {
        return landMarkTxt;
    }
    public static String getSaveBtn() {
        return saveBtn;
    }
}

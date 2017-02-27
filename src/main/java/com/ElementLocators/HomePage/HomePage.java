package com.ElementLocators.HomePage;

/**
 * Created by saurabh on 27/02/17.
 */
public class HomePage {
    private static String searchField = "com.urbanclap.urbanclap:id/search";
    private static String searchTextfield = "com.urbanclap.urbanclap:id/search_bar";
    private static String selectService = "com.urbanclap.urbanclap:id/imageView_subcategory";


    public static String getSearchField() {

            return searchField;
    }


    public static String getSearchTextfield() {
        return searchTextfield;
    }

    public static String getSelectService() {
        return selectService;
    }


}

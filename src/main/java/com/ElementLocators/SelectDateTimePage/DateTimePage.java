package com.ElementLocators.SelectDateTimePage;

/**
 * Created by saurabh on 27/02/17.
 */
public class DateTimePage {
    private static String dateSelect = "com.urbanclap.urbanclap:id/backgroundDate";
    private static String timeSelect = "com.urbanclap.urbanclap:id/frag_schedular_time_slot_item_button";
    private static String continueBtn = "com.urbanclap.urbanclap:id/next";


    public static String getDateSelect() {
        return dateSelect;
    }

    public static String getTimeSelect() {
        return timeSelect;
    }
    public static String getContinueBtn() {
        return continueBtn;
    }


}
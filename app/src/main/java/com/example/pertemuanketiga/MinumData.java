package com.example.pertemuanketiga;

import java.util.ArrayList;

public class MinumData {
    private static String[] title = new String[]{"Boba", "Soft Drink", "Milk Tea", "Milk Shake"};
    private static int[] thumbnail = new
            int[]{R.drawable.boba, R.drawable.softdrink, R.drawable.milktea, R.drawable.milkshake};
    public static ArrayList<MinumModel> getListData(){
        MinumModel minumModel = null;
        ArrayList<MinumModel> list =  new ArrayList<>();
        for (int i=0; i<title.length; i++){
            minumModel = new MinumModel();
            minumModel.setLogo(thumbnail[i]);
            minumModel.setNamaMinum(title[i]);
            list.add(minumModel);
        }
        return list;
    }

}

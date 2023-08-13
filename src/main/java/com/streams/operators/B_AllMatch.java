package com.streams.operators;

import com.streams.util._Constants;

public class B_AllMatch {
    public static void main(String[] args) {
        //like every in javascirpt
        boolean areallmatching = _Constants._productList.stream().allMatch((product)-> product.getPrice() == 3);
        System.out.println("are all the values equal to 3: "+areallmatching);
        
        boolean areallmatchingname = _Constants.allmatchproductList.stream().allMatch((product)->product.getName().equals("potatoes"));
        System.out.println("are all the values equal to potatoes: "+areallmatchingname);
    }
}

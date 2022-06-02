package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        int i = 0;
        while (i < intList.size()) {
            if( intList.get(i) > 0 && intList.get(i) % 2 == 0) i++;
            else intList.remove(i);
        }
        Collections.sort(intList);
        System.out.println(intList);
    }
}

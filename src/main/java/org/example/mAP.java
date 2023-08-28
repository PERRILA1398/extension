package org.example;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Test
public class mAP {

    public void mapofnumbers() {

        int[] arr = {1, 2, 3, 10, 4, 3, 10, 2, 4, 1};
        int[] arr1 = {1, 4, 5, 6, 7, 6, 1, 5};
        Map<Integer, Integer> mapofid = new HashMap<Integer, Integer>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr1.length; j++) {
                {
                    if (i % 2==0) {
                        System.out.println( "True");
                    } else
                        System.out.println("False");
                    }
                    }
                }
            }
        }



/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;


public class Main {

    public static void main(String[] args) {
        PS test1 = new PS(1, 2);
        PS test2 = new PS(2, 4);
        PS test3 = PS.add(test1, test2);

        System.out.println(test3.getTu());
        System.out.println(test3.getMau());


    }
}
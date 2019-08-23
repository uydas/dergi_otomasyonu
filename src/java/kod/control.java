/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kod;

/**
 *
 * @author Lenovo
 */


    public class control {

        public String tarih(String date) {
            String newFormat = "";
            String[] dateArray = date.split("\\.");
            for (int i = dateArray.length - 1; i >= 0; i--) {
                newFormat = newFormat + dateArray[i];

            }
            return newFormat;
        }}
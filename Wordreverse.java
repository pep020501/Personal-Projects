/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordreverse;

import java.util.ArrayList;

public class Wordreverse {

  private static String word = "Marsha is a teacher";
  private static String reverseword ="";
  private static char letter;
    public static void main(String[] args) {
        System.out.println("Before: " +word);
        for (int i = 0; i < word.length(); i++){
            letter = word.charAt(i);
            reverseword = letter + reverseword.toLowerCase();
        }
            System.out.println("After: "+reverseword);
            System.out.println(word.substring(0, 6));
            System.out.println(word.equals(reverseword));
    }
    
}

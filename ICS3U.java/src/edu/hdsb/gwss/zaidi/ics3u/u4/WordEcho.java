/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String word;
        int length;
        
        System.out.print("Enter a word: ");
        word = input.nextLine();
       
        length = word.length();
        
        do {
            System.out.println(word + " ");
            length--;
        } while (length > 0);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaapp02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 4-11-12-hallgato
 */
public class JavaApp02 {
    static List<String> musicList=new ArrayList<>();
    public static void main(String[] args) {
        //Aartist - Title (2024)
        Scanner sc=new Scanner(System.in);
        System.out.println("Please give the count of songs:");
        int count=0;
        
        try {
            count=Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("THIS IS NOT A NUMBER");
            count=1;
        } finally {
            System.out.println("Value of count"+count);
        }
        
        for (int i = 0; i < count; i++) {
            String music=read();
            musicList.add(music);
        }
        for (int i = 0; i < musicList.size(); i++) {
            print(musicList.get(i));
        }
        for(String m: musicList){
            print(m);
            }
        read();
    }
    
    static void print(String music){
        String [] parts=music.split("-");
        String artist=parts[0].trim();
        String titleAndYear[] =parts[1].split("\\(");
        String title = titleAndYear[0].trim();
        String year= titleAndYear[1].substring(0, titleAndYear[1].length()-1);
        p("Artist: "+artist);
        System.out.println("Title"+ title);
        System.out.println("Realesed:"+ year);
        System.out.println("");
    }
    
    static void p(String m){
        System.out.println(m);
    }
    
    static String read(){
        Scanner sc = new Scanner(System.in);
        String input =null;
        do{
            System.out.println("Enter your favorutie song:");
            System.out.println("Please use the following format: "
                    + "Artist -Title (Year)");
            input=sc.nextLine();
        }while(isValid(input));
        return input;
    }
    
    static boolean isValid(String input){
        return input==null||
               input.isEmpty() ||
                !input.contains("-")||
                !input.contains("(")||
                !input.contains(")");
    }
    
}

package Ć9_Z1;

import java.io.*;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);
        //String from = scn1.next();
        //String to = scn1.next();
        try (BufferedWriter bwriterMain = new BufferedWriter(new FileWriter(new File("t1.txt"))); BufferedReader breader = new BufferedReader(new FileReader(new File("t1.txt"))); BufferedWriter bwriter = new BufferedWriter(new FileWriter(new File("t2.txt"),true))){
            String row = "";
            System.out.println("wpisz cus");
            while(!row.equals("stop ")) {
                row = scn1.nextLine();
                bwriterMain.write(row+"\n");
                bwriterMain.flush();
            }
            String line;
            int charCount = 0;
            int darkCharCount = 0;
            int wordCount = 0;
            int linesCount = 0;
            while((line = breader.readLine())!=null){
                charCount += line.length();
                for (int i = 0; i < line.length(); i++) {
                    if(!Character.isWhitespace(line.charAt(i))){
                        darkCharCount++;
                    }
                }
                String [] wyrazy = line.split(" ");
                wordCount += wyrazy.length;
                linesCount++;
                bwriter.write("_"+line+"\n");
            }
            System.out.println("znaków:" + charCount);
            System.out.println("czarnych znaków: " + darkCharCount);
            System.out.println("liczba wyrazów: " + wordCount);
            System.out.println("liczba linijek: " + linesCount);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
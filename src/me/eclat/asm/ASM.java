package me.eclat.asm;

import java.io.*;

public class ASM {

    public static void main(String[] args) {
        System.out.println(new File(System.getProperty("user.dir"), "args.txt").getPath());
        String filename = "args.txt";
        StringBuffer b = new StringBuffer();
        try (BufferedReader in = new BufferedReader(new FileReader(new File(System.getProperty("user.dir"), filename)))){
            String line;
            while((line = in.readLine()) != null) b.append(line + "?");
        } catch (FileNotFoundException e){
            e.printStackTrace();
            return;
        } catch (IOException e){
            e.printStackTrace();
            return;
        }

        System.out.println(b.toString());
    }
}

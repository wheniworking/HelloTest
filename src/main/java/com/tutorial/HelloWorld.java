package com.tutorial;

import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        String welcomString = System.getProperties().getProperty("welcomeString");
        String titles = System.getProperties().getProperty("titles");
        String[] titleArr = titles.split(",");


        FileWriter writer = new FileWriter(new File("test.md"));
        writer.write(welcomString);
        writeTripuleLine(writer);

        for (String title : titleArr) {
            writer.write("## " + title);
            writeTripuleLine(writer);
        }

        writer.flush();
        writer.close();


    }

    private static void writeTripuleLine(FileWriter writer) throws IOException {
        writer.write("\n");
        writer.write("\n");
        writer.write("\n");
    }
}

package ru.cft.myProject;

import java.io.*;
import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Specify input file name or type EXIT to stop application");
            String inputFileName = scanner.nextLine();

            if (inputFileName.toUpperCase().equals("EXIT")) {
                break;
            }

            String[][] figuresParams = new String[100][2];
            try {
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                int lineCounter = 0;
                String str = reader.readLine();
                while (str != null) {
                    System.out.println("[" + lineCounter / 2 + "][" + lineCounter % 2 + "]: " + str);
                    figuresParams[lineCounter / 2][lineCounter % 2] = str;
                    lineCounter++;
                    str = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Specify output file name or CONSOLE or type EXIT to stop application");
            String destinationPoint = scanner.nextLine();

            BufferedWriter outputWriter;

            if (destinationPoint.toUpperCase().equals("EXIT")) {
                break;
            }

            try {
                if (destinationPoint.toUpperCase().equals("CONSOLE")) {
                    outputWriter = new BufferedWriter(new OutputStreamWriter(System.out));
                } else {
                    outputWriter = new BufferedWriter(new FileWriter(destinationPoint));
                    outputWriter.write("Test file output stream");
                }

                GeometryFigureDescriber desciber = new GeometryFigureDescriber();
                desciber.figureParameters = figuresParams;
                desciber.describe(outputWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

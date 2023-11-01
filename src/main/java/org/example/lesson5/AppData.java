package org.example.lesson5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    private String[] data;
    private final String filePath = "src\\test\\resources\\AppData.csv";

    public void writerFile() {
        data = new String[]
                {"Value1;Value2;Value3,",
                        "100;200;333,",
                        "500;600;800,"};
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String line : data) {
                writer.append(line).append("\n");
            }
            System.out.println("Данные были записаны: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readerFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int a = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                a += 1;
                for (int i = 0; i < parts.length; i++) {
                    String value = parts[i].trim();
                    System.out.println("Данные из файла " + a + " строки: " + value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

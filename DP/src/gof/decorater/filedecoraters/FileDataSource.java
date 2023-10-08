/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.decorater.filedecoraters;

/**
 *
 * @author elitebook g3
 */
import java.io.*;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    public void writeData(String data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readData() {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }

    @Override
    public String readOriginalData() {
        return readData();
    }
}
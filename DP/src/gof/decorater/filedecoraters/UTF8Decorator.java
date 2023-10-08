/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.decorater.filedecoraters;

/**
 *
 * @author elitebook g3
 */
import java.nio.charset.StandardCharsets;

class UTF8Decorator extends DataSourceDecorator {
    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
    }

    @Override
    public String readData() {
        String originalData = super.readData();
        String utf8Data = convertToUTF8(originalData);
        return utf8Data;
    }

    @Override
    public String readOriginalData() {
        return super.readOriginalData();
    }

    private String convertToUTF8(String data) {
        byte[] byteArray = data.getBytes(StandardCharsets.UTF_8);
        return new String(byteArray, StandardCharsets.UTF_8);
    }
}
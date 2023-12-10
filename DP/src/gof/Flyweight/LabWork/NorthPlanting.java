/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Flyweight.LabWork;

/**
 *
 * @author elitebook g3
 */
import java.awt.*;

public class NorthPlanting implements Planting {
    private static NorthPlanting instance;
    private Forest forest;
    private int sizeFactor = 1;

    private NorthPlanting() {
        forest = Forest.getInstance();
    }

    public static NorthPlanting getInstance() {
        if (instance == null) {
            instance = new NorthPlanting();
        }
        return instance;
    }

    @Override
    public void plant(int xPos, int yPos, String name, Color color, String otherData) {
        forest.plantTree(xPos, yPos,sizeFactor, name, color, otherData);
    }
}
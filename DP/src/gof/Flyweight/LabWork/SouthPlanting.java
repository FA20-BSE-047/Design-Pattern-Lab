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

public class SouthPlanting implements Planting {
    private static SouthPlanting instance;
    Forest forest;
    private int sizeFactor = 3;
    private SouthPlanting() {
        forest = Forest.getInstance();
    }

    public static SouthPlanting getInstance() {
        if (instance == null) {
            instance = new SouthPlanting();
        }
        return instance;
    }

    @Override
    public void plant(int xPos, int yPos, String name, Color color, String otherData) {
        forest.plantTree(xPos, yPos,sizeFactor, name, color, otherData);
    }
}
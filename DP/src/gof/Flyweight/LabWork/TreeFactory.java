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
import java.util.HashMap;
import java.util.Map;


public class TreeFactory {
    static Map<String, IMyTreeType> treeTypes = new HashMap<>();

    public static IMyTreeType getTreeType(String name, Color color, String otherTreeData) {
        IMyTreeType result = treeTypes.get(name);
        if (result == null)
            result = new TreeType(name, color, otherTreeData);
        treeTypes.put(name, result);
        return result;
    }
}
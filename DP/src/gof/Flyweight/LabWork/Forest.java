/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Flyweight.LabWork;

/**
 *
 * @author elitebook g3
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();
    private static Forest instance;

    public static Forest getInstance() {
        if (instance == null) {
            instance = new Forest();
        }
        return instance;
    }

    private Forest() {
        super("Forest");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void plantTree(int x, int y, int size, String name, Color color, String otherTreeData) {
        IMyTreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, size, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }

}
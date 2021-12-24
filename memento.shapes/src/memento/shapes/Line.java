/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.shapes;

/**
 *
 * @author shah
 */


import java.awt.Color;
import java.awt.Graphics;


public class Line extends BaseShape {
    private final int LINE_SIZE = 60;

    public Line(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return LINE_SIZE;
    }

    @Override
    public int getHeight() {
        return 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
  
}

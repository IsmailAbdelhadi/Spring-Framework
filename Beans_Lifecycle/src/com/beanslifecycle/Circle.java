package com.beanslifecycle;

public class Circle implements Shape{


    private Draw2D drawShape2d;
    private Draw3D drawShape3d;


    public Circle(Draw2D drawShape2d, Draw3D drawShape3d) {
        this.drawShape2d = drawShape2d;
        this.drawShape3d = drawShape3d;
    }

    @Override
    public void drawShape2d() {
        drawShape2d.draw("Circle");
    }

    @Override
    public void drawShape3d() {
        drawShape3d.draw("Circle");
    }







}

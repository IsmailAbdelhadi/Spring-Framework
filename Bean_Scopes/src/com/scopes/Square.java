package com.scopes;

public class Square implements Shape{


    private Draw2D drawShape2d;
    private Draw3D drawShape3d;


    public void setDrawShapeFor2d(Draw2D drawShape2d) {
        this.drawShape2d = drawShape2d;
    }

    public void setDrawShapeFor3d(Draw3D drawShape3d) {
        this.drawShape3d = drawShape3d;
    }



    @Override
    public void drawShape2d() {
        drawShape2d.draw("Square");
    }

    @Override
    public void drawShape3d() {
        drawShape3d.draw("Square");
    }
}

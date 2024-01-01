package com.beanslifecycle;

public class Square implements Shape{


    private Draw2D drawShape2d;
    private Draw3D drawShape3d;


    public void setDrawShapeFor2d(Draw2D drawShape2d) {
        this.drawShape2d = drawShape2d;
    }

    public void setDrawShapeFor3d(Draw3D drawShape3d) {
        this.drawShape3d = drawShape3d;
    }

    //this is the init method
    public void connectionToDatabase() {
        System.out.println("the connection to database established");
    }


    //this is the destroy method
    public void disconnectFromDatabase() {
        System.out.println("the connection to DB is ended");
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

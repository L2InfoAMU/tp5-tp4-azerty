package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    int x, y , width, height;
    Color color;

    public Rectangle(int x, int y, int width, int height, Color color){
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;
        this.color=color;
    }


    @Override
    public boolean contains(Point point) {
        return( x>= this.x && x<=this.x+width && y>=this.y && y<=this.y+height);
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}

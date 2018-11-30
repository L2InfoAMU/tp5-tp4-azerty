package image;

import image.Image;
import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {

    Color color;
    int width;
    int height;
    Color [][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
         for(int i=0; i<width; i++){
             for(int j=0;j<height; j++){
                 pixels[i][j]=color;
             }
         }

    }

    public BruteRasterImage(Color[][] colors){


    }


    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}

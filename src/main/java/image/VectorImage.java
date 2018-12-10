package image;


import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class VectorImage implements Image{
    List<Shape> shapes;
    int width, height;

    public VectorImage(List<Shape> shapes, int width, int height){
        this.shapes = new ArrayList<>(shapes);
        this.shapes = shapes;
        setHeight(height);
         setWidth(width);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        Point point = new Point(x, y);
        for (Shape shapes: shapes) {
            if (shapes.contains(point)) {
                return shapes.getColor();
            }
        }
        return Color.WHITE;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    protected void setWidth(int width)           // : fixe la largeur de l’image.
    { this.width=width; }
    protected void setHeight(int height)         // : fixe la hauteur de l’image.
    { this.height=height; }
}


/*
— VectorImage : dans cette représentation, on stocke une liste de formes géométriques (utilisant l’interface Shape).
Une image de type sera construite à partir de List<Shape> shapes.
Chaque forme géométrique(qui peut être un cercle, un rectangle, . . .) contient un certain nombre de points et définit la couleur des points à l’intérieur.

La couleur d’un point de l’image est la couleur de la première forme dans la liste qui contient le point ou bien blanc si le point n’est contenu dans aucune forme.
 */
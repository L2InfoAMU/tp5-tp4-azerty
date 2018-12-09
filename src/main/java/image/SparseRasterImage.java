package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

import static util.Matrices.requiresNonNull;

public class SparseRasterImage extends RasterImage{

    Map<Point, Color> hashMap;
    int width;
    Point point;

    Color[][] pixels;

  //  — deux constructeurs :

  public SparseRasterImage(Color color, int width, int height)     //: construisant une image de la taille spécifiée et dont tous les pixels sont de la couleur spécifiée .
    {   super(color, width, height);
    }
  public SparseRasterImage(Color[][] pixels)                       //: construisant une image à partir de la matrice donnée en paramètre.
  {                                                                //:  Le premier indice correspondant à la coordonnée en x et le deuxième indice correspondant à la coordonnée en y.
      super(pixels);
  }
  //neufs méthodes :



  public void createRepresentation()                               //: ++pour stocker  l’association entre points et couleurs.
  {  this.hashMap=new HashMap<>();}

  public void setPixelColor(Color color, int i, int j)             //: fixe la couleur d’un pixel (en associant le point de coordonnée (x, y) à la couleur).
  {
      point = new Point(i,j);
      hashMap.put(point, color);
    }

  public Color getPixelColor(int x, int y)                         //: retourne la couleur d’un pixel.
    {
        point = new Point(x,y);
        return this.hashMap.get(point);}

  private void setPixelsColor(Color[][] pixels)                    //: met à jour les valeurs de couleurs de l’image  en utilisant les valeurs de la matrice donnée en paramètre.
    {            requiresNonNull(pixels);
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                setPixelColor(pixels[i][j], i, j);
            }
        }
    }
  private void setPixelsColor(Color color)                         //: change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.
  {
        for (int i = 0; i < getWidth(); i++) {
        for (int j = 0; j < getHeight(); j++) {
            setPixelColor(color, i , j);
        }
        }
    }

  public int getWidth()                                            //: retourne la largeur de l’image.
    { return this.width;}

    public int getHeight()                                         //: retourne la hauteur de l’image.
    { return this.height;}

    protected void setWidth(int width)                             //: fixe la largeur de l’image.
    { this.width=width;}

    protected void setHeight(int height) //: fixe la hauteur de l’image.
    { this.height=height;  }
}

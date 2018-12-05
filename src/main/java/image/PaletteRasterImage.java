package image;
import javafx.scene.paint.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image {

    int width;
    int height;
    List<Color> palette;
    int[][] indexPalette;

    public PaletteRasterImage(Color color, int width, int height) {
        this.width=width;
        this.height=height;
        createRepresentation();
    }

    public PaletteRasterImage(Color[][] pixels){

    }

    public void createRepresentation()                                    // :alloue la liste pour stocker la palette et la matrice représentant l’image (à utiliser dans le constructeur).
    { this.indexPalette=new  int[getWidth()][getHeight()];
    this.palette= new ArrayList<>();
    }
    public void setPixelColor(Color color, int x, int y)                  // :fixe la couleur d’un pixel (en ajoutant la couleur à la palette si elle n’était pas dans la palette).
    {int index =palette.indexOf(color);
      if (index == -1)
          palette.add(color);
    }

    public Color getPixelColor(int x, int y)                              // :retourne la couleur d’un pixel.
    {return palette.get(indexPalette[x][y]);}

    public void setPixelsColor(Color[][] pixels )                         //: met à jour les valeurs de couleurs de l’image en utilisant les valeurs de la matrice donnée en paramètre.
    {}
    private void setPixelsColor(Color color)                              // : change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.
    {}
    public int getWidth()                                                 //: retourne la largeur de l’image.
    { width();}
    public int getHeight()                                                //: retourne la hauteur de l’image.
    {}
    protected void setWidth(int width)                                    //: fixe la largeur de l’image.
    {}
    protected void setHeight(int height)                                  // : fixe la hauteur de l’image.
    {}


}

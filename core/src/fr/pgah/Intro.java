package fr.pgah;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Intro extends ApplicationAdapter {
  SpriteBatch batch;                                               // variables (SpriteBatch : Type de la variable | batch : nom de la variable)
  Texture img;                                                        // variables (Si le type commence par une majuscule, c'est un type objet | Si le type commence par une minuscule, c'est un type primitif)
  Texture[] imgs;
  int[] coordonneesX;
  int[] coordonneesY;
  int[] hauteurImgs;
  boolean[] montent;
  int hauteurFenetre;

  @Override
  public void create() {                                   // méthode (create : nom de la méthode)
    batch = new SpriteBatch();                                   // méthode (= : affectation | new : instanciation)

    img = new Texture("sio.jpg");                                   // méthode
    imgs[0] = new Texture("sio.jpg");
    imgs[1] = new Texture("badlogic.jpg");

    coordonneesX = new int [2];
    coordonneesX[0] = 0;
    coordonneesX[1] = 100;

    coordonneesY = new int [2];
    coordonneesY[0] = 0;
    coordonneesY[1] = 200;

    hauteurImgs = new int[2];
    hauteurImgs[0] = imgs[0].getHeight();
    hauteurImgs[1] = imgs[1].getHeight();

    montent = new boolean[2];
    montent[0] = true;
    montent[1] false;





    hauteurFenetre = Gdx.graphics.getHeight();
    onMonte = true;
  }

  @Override
  public void render() {
    reinitialiserBackgroud(); // corps de la méthode
    testerBordures();
    programmeX();
    testerDirection();
    dessin();
  }

  private void dessin() {
    batch.begin();
    
    
    batch.draw(imgs[0], coordonneesX[0], coordonneesY[0]); 
    batch.draw(imgs[1], coordonneesX[1], coordonneesY[1]);                                                           // corps de la méthode
    
    
    
    batch.end();                                                                // corps de la méthode
  }

  private void testerDirection() {
    if (onMonte == true) {
      y = y + 1;                                                                                // incrémentation
    } else {
      y = y - 1;                                                                                  //décrémentation
    }
  }

  private void programmeX() {
    x = x + 1;
  }

  private void testerBordures() {

    if(y + hauteurImg == hauteurFenetre) {
      onMonte = false;
    }
    // if (Tape la bordure basse)
    if(y == 0) {
      onMonte = true;
    }
  }

  private void reinitialiserBackgroud() {
    ScreenUtils.clear(1, 0, 0, 1);
  }
}
package View;

import Controller.ControllerMenu;
import Controller.ControllerMouse;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static Tools.Music.startMainMenuMusic;


public class ViewHandler extends Application {

    private Stage primaryStage;
    private ViewLancement ml;
    private ViewMenu mp;
    private ViewMenuOptions mo;
    private ViewChoixJoueur vcj;
    private Menu model;
    private ControllerMenu controllerMenu;
    private Group root;
    private ViewJeu viewJeu;
    private ControllerMouse controllerMouse;


    /**
     * Permet le lancement de l'application : méthode obligatoire pour JavaFX
     *
     * @param primaryStage ()
     * @throws Exception ()
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        // root représente le panel qui va être affiché : tout ce qui doit être affiché doit lui être ajouté

        root = new Group();
        Scene scene = new Scene(root);
        scene.getStylesheets().add("Asset/css/styleCss.css");

        model = new Menu();

        mo = new ViewMenuOptions(model, root);
        mp = new ViewMenu(model, root);
        ml = new ViewLancement(model, root);
        vcj = new ViewChoixJoueur(model, root);

        /*
        A réactivé (CODE SARAH)

        viewJeu = new ViewJeu(model, root);
        controllerMouse = new ControllerMouse(this, model);

        public void setEventHandlerJeu(ControllerMouse controllerMouse){viewJeu.setEnvents(controllerMouse);}
        public ViewJeu getViewJeu(){return viewJeu;}*/


        controllerMenu = new ControllerMenu(this, model);
        //scene.setOnKeyPressed(this.controllerGs);

        //LunchMenuPrincipale();

        // Affichage du menu
        primaryStage.setTitle("Kamisado");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(true);
        primaryStage.show();
        startMainMenuMusic();
    }

    public void setEventHandlerMenu(ControllerMenu cm) {
        ml.setEvents(cm);
        mp.setEvents(cm);
        mo.setEvents(cm);
        vcj.setEvents(cm);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ViewLancement getMl() {
        return ml;
    }

    public ViewMenu getMp() {
        return mp;
    }

    public ViewChoixJoueur getMcj() {
        return vcj;
    }

    public ViewMenuOptions getMo() {
        return mo;
    }

    public void setVueCompleteLancement() {
        ml.setVueCompleteLancement();
    }

    public void setVueCompleteChoixJoueur() {
        vcj.setVueCompleteChoixJoueur();
    }

    public void setVueCompleteOptions() {
        mo.setVueCompleteOptions();
    }

    public void setVueCompleteMenu() {
        mp.setVueCompleteMenu();
    }

}

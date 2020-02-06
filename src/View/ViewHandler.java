package View;

import Controller.ControllerMenu;
import Controller.ControllerMouse;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.stage.Stage;
import javafx.stage.StageStyle;




public class ViewHandler extends Application {

    private Stage primaryStage;
    private ViewMenu mp;

    private Menu model;
    private ControllerMenu controllerMenu;
    private Group root;
    private ViewJeu viewJeu;
    private ControllerMouse controllerMouse;


    //private ControllerOptions controllerOptions;


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

        model = new Menu();

        mp = new ViewMenu(model, root);

        /*
        A réactivé (CODE SARAH)
        viewJeu = new ViewJeu(root,model);
        controllerMouse = new ControllerMouse(this, model);

        public void setEventHandlerJeu(ControllerMouse cm){viewJeu.setEnvents(cm);}

        public ViewJeu getViewJeu(){return viewJeu;}*/



        //controllerMenu = new ControllerMenu(this, model);
        //scene.setOnKeyPressed(this.controllerGs);

        //LunchMenuPrincipale();

        // Affichage du menu

        primaryStage.setTitle("Star CityFrag");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }



}

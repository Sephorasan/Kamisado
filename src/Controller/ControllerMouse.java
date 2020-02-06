package Controller;

import Model.Jeu;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class ControllerMouse implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private Jeu model;

    public ControllerMouse(ViewHandler launcher, Jeu model) {
        this.model = model;
        this.launcher = launcher;
        //this.launcher.setEnventHandlerInGame(this);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        System.out.println(mouseEvent.getSource());
        //if(mouseEvent.getSource().equals(launcher.getViewInGame())){}
    }
}
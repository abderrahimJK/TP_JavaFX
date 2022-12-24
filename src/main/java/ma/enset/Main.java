package ma.enset;

import javafx.application.Application;
import javafx.stage.Stage;
import ma.enset.presentation.views.ViewFactory;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewFactory viewFactory = new ViewFactory();

        viewFactory.showDashboard();
    }
}
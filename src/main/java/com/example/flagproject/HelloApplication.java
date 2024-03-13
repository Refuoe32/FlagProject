 package com.example.flagproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Loading the CSS file
        String css = getClass().getResource("Style.css").toExternalForm();

        BorderPane root = new BorderPane();
        // Setting background color to skyblue
        root.setStyle("-fx-background-color: skyblue;");

        // Header
        Text header = new Text("SELECT COUNTRY TO DISPLAY ITS FLAG");
        header.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        root.setTop(header);
        BorderPane.setAlignment(header, javafx.geometry.Pos.CENTER);
        header.getStyleClass().add("border-pane-top");

        // Button Box
        BorderPane buttonBox = new BorderPane();
        VBox buttonVBox = new VBox();
        buttonVBox.setSpacing(30);
        buttonVBox.setAlignment(javafx.geometry.Pos.CENTER);

        Button btn1= new Button("GHANA");
        Button btn2 = new Button("GERMANY");
        Button btn3 = new Button("UGANDA");

        btn1.getStyleClass().add("button");
        btn2.getStyleClass().add("button");
        btn3.getStyleClass().add("button");

        btn1.setOnAction(e -> displayFlagGhana());
        btn2.setOnAction(e -> displayFlagGermany());
        btn3.setOnAction(e -> displayFlagUganda());

        buttonVBox.getChildren().addAll(btn1, btn2, btn3);
        buttonBox.setCenter(buttonVBox);
        root.setCenter(buttonBox);
        BorderPane.setAlignment(buttonBox, javafx.geometry.Pos.CENTER);
        buttonBox.getStyleClass().add("border-pane-center");

        primaryStage.setScene(new Scene(root, 500, 300));

        primaryStage.getScene().getStylesheets().add(css);

        primaryStage.setTitle("Country Flag Display");
        primaryStage.show();
    }

    private void displayFlagUganda() {
        Pane flagPane = createFlagPaneUganda();
        displayFlagPane(flagPane);
    }

    private void displayFlagGhana() {
        Pane flagPane = createFlagPaneGhana();
        displayFlagPane(flagPane);
    }

    private void displayFlagGermany() {
        Pane flagPane = createFlagPaneGermany();
        displayFlagPane(flagPane);
    }

    private Pane createFlagPaneUganda() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 300);

        javafx.scene.shape.Rectangle blueRectangle = new javafx.scene.shape.Rectangle(0, 0, 300, 66.66);
        blueRectangle.setFill(javafx.scene.paint.Color.BLUE);

        javafx.scene.shape.Rectangle whiteRectangle = new javafx.scene.shape.Rectangle(0, 66.66, 300, 66.66);
        whiteRectangle.setFill(javafx.scene.paint.Color.WHITE);

        javafx.scene.shape.Rectangle greenRectangle = new javafx.scene.shape.Rectangle(0, 133.32, 300, 66.66);
        greenRectangle.setFill(javafx.scene.paint.Color.GREEN);

        pane.getChildren().addAll(blueRectangle, whiteRectangle, greenRectangle);

        return pane;
    }

    private Pane createFlagPaneGhana() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 300);

        javafx.scene.shape.Rectangle redRectangle = new javafx.scene.shape.Rectangle(0, 0, 300, 66.66);
        redRectangle.setFill(javafx.scene.paint.Color.RED);

        javafx.scene.shape.Rectangle yellowRectangle = new javafx.scene.shape.Rectangle(0, 66.66, 300, 66.66);
        yellowRectangle.setFill(javafx.scene.paint.Color.YELLOW);

        javafx.scene.shape.Rectangle greenRectangle = new javafx.scene.shape.Rectangle(0, 133.32, 300, 66.66);
        greenRectangle.setFill(javafx.scene.paint.Color.GREEN);

        pane.getChildren().addAll(redRectangle, yellowRectangle, greenRectangle);

        return pane;
    }

    private Pane createFlagPaneGermany() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 300);

        javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(0, 0, 300, 66.66);
        blackRectangle.setFill(javafx.scene.paint.Color.BLACK);

        javafx.scene.shape.Rectangle redRectangle = new javafx.scene.shape.Rectangle(0, 66.66, 300, 66.66);
        redRectangle.setFill(javafx.scene.paint.Color.RED);

        javafx.scene.shape.Rectangle yellowRectangle = new javafx.scene.shape.Rectangle(0, 133.32, 300, 66.66);
        yellowRectangle.setFill(javafx.scene.paint.Color.YELLOW);

        pane.getChildren().addAll(blackRectangle, redRectangle, yellowRectangle);

        return pane;
    }

    private void displayFlagPane(Pane flagPane) {
        BorderPane root = new BorderPane();
        root.setCenter(flagPane);
        Stage stage = new Stage();
        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Country Flag Display");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

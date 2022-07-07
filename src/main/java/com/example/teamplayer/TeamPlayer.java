package com.example.teamplayer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class TeamPlayer extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane);

        scene.setFill(Color.WHITE);

        Image image1 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\164.png"));
        Image image2 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\107.png"));
        Image image3 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\41.png"));
        Image image4 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\94.png"));
        Image image5 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\59.png"));
        Image image6 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\2740.png"));
        Image image7 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\135.png"));
        Image image8 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\9.png"));
        Image image9 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\1124.png"));
        Image image10 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\1125.png"));
        Image image11 = new Image(new FileInputStream("E:\\JavaFX_Programs\\TeamPlayer\\src\\main\\resources\\com\\example\\teamplayer\\111.png"));

        ImageView imageView = new ImageView(image1);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        ImageView imageView1 = new ImageView(image2);
        imageView1.setFitHeight(100);
        imageView1.setFitWidth(100);

        ImageView imageView2 = new ImageView(image3);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);

        ImageView imageView3 = new ImageView(image4);
        imageView3.setFitHeight(100);
        imageView3.setFitWidth(100);

        ImageView imageView4 = new ImageView(image5);
        imageView4.setFitHeight(100);
        imageView4.setFitWidth(100);

        ImageView imageView5 = new ImageView(image6);
        imageView5.setFitHeight(100);
        imageView5.setFitWidth(100);

        ImageView imageView6 = new ImageView(image7);
        imageView6.setFitHeight(100);
        imageView6.setFitWidth(100);

        ImageView imageView7 = new ImageView(image8);
        imageView7.setFitHeight(100);
        imageView7.setFitWidth(100);

        ImageView imageView8 = new ImageView(image9);
        imageView8.setFitHeight(100);
        imageView8.setFitWidth(100);

        ImageView imageView9 = new ImageView(image10);
        imageView9.setFitHeight(100);
        imageView9.setFitWidth(100);

        ImageView imageView10 = new ImageView(image11);
        imageView10.setFitHeight(100);
        imageView10.setFitWidth(100);

        gridPane.setMinSize(100, 100);
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(imageView, 0, 0);
        gridPane.add(imageView1,1, 0);
        gridPane.add(imageView2,2, 0);
        gridPane.add(imageView3,3, 0);
        gridPane.add(imageView4,4, 0);
        gridPane.add(imageView5,0, 1);
        gridPane.add(imageView6,1, 1);
        gridPane.add(imageView7,2, 1);
        gridPane.add(imageView8,3, 1);
        gridPane.add(imageView9,4, 1);
        gridPane.add(imageView10,2, 2);

        stage.setTitle("TeamPlayers");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

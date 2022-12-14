package com.example.finalproject;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ControllerSave {

    @FXML
    ChoiceBox formatChoice;

    @FXML
    TextField fileName;
    @FXML
    private Button saveBtn;

    ImageView preserveImageView ;

    ControllerEdit edit = new ControllerEdit();

    public void choiceFormat(javafx.scene.input.MouseEvent mouseEvent) {
        getFormatChoiceValue();
    }

    public  String getFormatChoiceValue(){
        return (String)formatChoice.getValue();
    }

    public void fileName(MouseEvent actionEvent){
        System.out.println(getFileName()+" File name ");
        getFileName();
    }

    public String getFileName(){
        return fileName.getText();
    }

    public void buttonAction(ActionEvent event) throws IOException {

        saveImage();

    }

    public void saveImage(){

        preserveImageView=ControllerEdit.editView;
        System.out.println(preserveImageView.getImage().getHeight());

        String format = this.getFormatChoiceValue();
        System.out.println("Choice Format is "+this.getFormatChoiceValue());

        String fileName = this.getFileName();
        System.out.println("File Name is "+ this.getFileName());

        File outputFile = new File("/Users/satyamarora_1/IdeaProjects/FinalProject/images"+fileName+format);

        BufferedImage bImage = SwingFXUtils.fromFXImage(preserveImageView.snapshot(null, null),null);

        try {
            ImageIO.write(bImage,"png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ImageSaved");

    }

}

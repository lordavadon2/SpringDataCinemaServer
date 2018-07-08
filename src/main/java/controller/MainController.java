package controller;

import DAOLayer.DAOTicket;
import ModelLayer.Entity.Ticket;
import ServiceLayer.ServiceTicket.TicketModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

import javax.xml.ws.Endpoint;

public class MainController{

    Endpoint endpoint = Endpoint.create(new TicketModel(new Ticket(), new DAOTicket()));
    @FXML
    private Label status;
    @FXML
    private Button btnStart;
    @FXML
   private Button btnStop;

    public void actStart(ActionEvent actionEvent) {
       endpoint.publish("http://localhost:8080/ws/ticket");
       status.setTextFill(Paint.valueOf("#36fb05"));
       status.setText("Работает");
       btnStart.setDisable(true);
       btnStop.setDisable(false);
    }


    public void actStop(ActionEvent actionEvent) {
        endpoint.stop();
        status.setTextFill(Paint.valueOf("#f90404"));
        status.setText("Остановлен");
        btnStart.setDisable(false);
        btnStop.setDisable(true);
    }


}

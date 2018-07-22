package controller;

import DAOLayer.DAOTicket;
import ModelLayer.Entity.Ticket;
import ServiceLayer.ServiceCinema.CinemaModel;
import ServiceLayer.ServiceTicket.TicketModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

import javax.xml.ws.Endpoint;

public class MainController{

    Endpoint endpointTicket = Endpoint.create(new TicketModel());
    Endpoint endpointCinema = Endpoint.create(new CinemaModel());
    @FXML
    private Label status;
    @FXML
    private Button btnStart;
    @FXML
   private Button btnStop;

    public void actStart(ActionEvent actionEvent) {
       endpointTicket.publish("http://localhost:8080/ws/ticket");
       endpointCinema.publish("http://localhost:8080/ws/cinema");
       status.setTextFill(Paint.valueOf("#36fb05"));
       status.setText("Работает");
       btnStart.setDisable(true);
       btnStop.setDisable(false);
    }


    public void actStop(ActionEvent actionEvent) {
        endpointTicket.stop();
        endpointCinema.stop();
        status.setTextFill(Paint.valueOf("#f90404"));
        status.setText("Остановлен");
        btnStart.setDisable(false);
        btnStop.setDisable(true);
    }


}

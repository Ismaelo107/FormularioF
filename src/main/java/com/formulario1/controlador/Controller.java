package com.formulario1.controlador;

import com.formulario1.modelo.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {


    Usuario user;
    List<Usuario> usuarios = new ArrayList<>();
    String id, nombre, apellidos, passwd;
    LocalDate fecha;

    @FXML
    private TextField txNombre;
    @FXML
    private TextField txApellidos;
    @FXML
    private TextField txPasswd;
    @FXML
    private TextField txId;
    @FXML
    private DatePicker txFecha;
    @FXML
    private Button registrar;
    @FXML
    private Button borrar;

    TableView<Usuario> listView = new TableView<>();


    @FXML
    public void onRegistrar(ActionEvent actionEvent) {
        alta();
        imprimir();
        vaciar();

    }

    private void alta() {
        id = txId.getText();
        nombre = txNombre.getText();
        apellidos = txApellidos.getText();
        passwd = txPasswd.getText();
        fecha = txFecha.getValue();


        usuarios.add(new Usuario(id, nombre, apellidos, passwd, fecha));

    }

    private void vaciar() {
        txId.setText(null);
        txNombre.setText(null);
        txApellidos.setText(null);
        txPasswd.setText(null);
        txFecha.setValue(null);
    }

    private void imprimir() {
        for (Usuario p :
                usuarios) {
            System.out.println(p);
        }
    }

    @FXML
    public void onBorrar(ActionEvent actionEvent) {
        vaciar();
    }
}
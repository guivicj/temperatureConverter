package org.example.conversortemperatura;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

import java.util.Calendar;

public class HelloController {
    @FXML
    private TextField txtFldDate;

    @FXML
    private TextField txtFldTemperature;

    @FXML
    private TextField txtFldConversion;
    @FXML
    private Button btnConvertToCelsius;

    @FXML
    private Button btnConvertToFahrenheit;

    @FXML
    private Button btnConvertToKelvin;

    @FXML
    private Button btnReinitialize;

    @FXML
    protected void initialize() {
        txtFldDate.setEditable(false);
        txtFldConversion.setEditable(false);
        txtFldDate.setText(Calendar.getInstance().getTime().toString());
        btnConvertToCelsius.setTooltip(new Tooltip("Convertir celsius"));
        btnConvertToFahrenheit.setTooltip(new Tooltip("Convertir Fahrenheit"));
        btnConvertToKelvin.setTooltip(new Tooltip("Convertir Kelvin"));
    }

    @FXML
    protected void onClickCelsius() {
        txtFldConversion.setText(Double.toString(Double.parseDouble(txtFldTemperature.getText())));
    }

    @FXML
    protected void onClickFahrenheit() {
        Double fahrenheitOpr = Double.parseDouble(txtFldTemperature.getText()) * 9 / 5 + 32;
        txtFldConversion.setText(Double.toString(fahrenheitOpr));
    }

    @FXML
    protected void onClickKelvin() {
        Double kelvinOpr = Double.parseDouble(txtFldTemperature.getText()) - 273.15;
        txtFldConversion.setText(Double.toString(kelvinOpr));
    }

    @FXML
    protected void onClickReinitialize() {
        txtFldDate.setText(Calendar.getInstance().getTime().toString());
        txtFldConversion.clear();
        txtFldTemperature.clear();
    }

}
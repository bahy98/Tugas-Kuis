/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;


import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
/**
 *
 * @author crowl
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private RadioButton lakilaki;
    
    @FXML
    private RadioButton Perempuan;

    @FXML
    private JFXTextField beratbadan;

    @FXML
    private JFXTextField nama;

    @FXML
    private JFXTextField tinggibadan;

    @FXML
    private JFXTextField ideal;

    @FXML
    private JFXTextArea hasil;

    @FXML
    private JFXTextArea saran;

    @FXML
    private Button reset;

    @FXML
    private Button proses;

    @FXML
    void beratbadan(ActionEvent event) {

    }

    @FXML
    void ideal(ActionEvent event) {

    }

    @FXML
    void lakilaki(ActionEvent event) {

    }
    
    @FXML
    void perempuan(ActionEvent event) {

    }

    @FXML
    void nama(ActionEvent event) {

    }

    @FXML
    private void proses(ActionEvent event) {
        String Nama = nama.getText();
        String BeratBadan = beratbadan.getText();
        String TinggiBadan = tinggibadan.getText();
        
        double tinggi, berat, kelamin = 0;
        tinggi = Double.valueOf(tinggibadan.getText());
        berat = Double.valueOf(beratbadan.getText());
        if(lakilaki.isSelected())
        {
            kelamin = (tinggi - 110);
        }
        else if(Perempuan.isSelected())
        {
            kelamin = (tinggi - 100);
        }
        if(kelamin < berat)
        {
            ideal.setText(""+kelamin);
            hasil.setText("Anda telah kelebihan berat badan");
            saran.setText("Anda harus diet, olahraga, istirahat teratur, banyak beraktivitas dan jangan malas lalu jangan lupa cari pasangan karena anda terlalu jomblo");
        }
        else if(kelamin > berat)
        {
            ideal.setText(""+kelamin);
            hasil.setText("Bahaya "+nama.getText()+"Jangan buang-buang waktu buat memperbaiki berat badan anda yang underweight. Berbahaya sekali!");
            saran.setText("Anda harus jaga pola makan, tidak boleh diet, perbanyak asupan karbohidrat dan kalsium dan mineral. Jangan lupa cari pasangan agar tidak jomblo");
        }
        else
        {
            ideal.setText(""+kelamin);
            hasil.setText("Berat badan anda sempurna dengan tinggi badan. Anda dalam kondisi ideal");
            saran.setText("Tidak usah cari pasangan karena anda sudah mandiri mengatur tubuh jadi tidak perlu ada pasangan untuk menjaga anda daripada yang Overweight atau yang Underweight. Tetap jaga kondisi badan dan salam dari program ini");
        }
    }

    @FXML
    private void reset(ActionEvent event) {
        nama.setText("");
        tinggibadan.setText("");
        beratbadan.setText("");
        ideal.setText("");
        hasil.setText("");
        saran.setText("");
        lakilaki.setSelected(false);
        Perempuan.setSelected(false);
        
        
    }

    @FXML
    void tinggibadan(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}
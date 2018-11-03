/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathan
 */
public class Util {

    public static Date converterToDate(String rowDate) {
        DateFormat df;
        Date data = new Date();

        try {
            df = new SimpleDateFormat("dd/MM/yyyy");
            data = df.parse(rowDate);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return data;
    }

    public static String converterToString(Date data) {
        DateFormat df;
        String dataString = null;

        df = new SimpleDateFormat("dd/MM/yyyy");
        dataString = df.format(data);

        return dataString;
    }
}

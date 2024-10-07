/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.toedter.calendar.IDateEvaluator;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class citasAsignadas implements IDateEvaluator {
//    private HashMap<Integer, int[]> fechas;
    
    private HashMap<Integer, HashMap<Integer, int[]>> fechas;

    // Constructor que acepta un HashMap de meses y días
    public citasAsignadas(HashMap<Integer, HashMap<Integer, int[]>> fechas) {
        this.fechas = fechas;
    }

    @Override
    public boolean isSpecial(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

       // Verificar si hay días especiales para el año y mes actuales
        if (fechas.containsKey(year)) {
            HashMap<Integer, int[]> monthDaysMap = fechas.get(year);
            if (monthDaysMap.containsKey(month)) {
                int[] specialDays = monthDaysMap.get(month);
                // Verificar si el día está en el array de días especiales
                for (int d : specialDays) {
                    if (d == day) {
                        return true;
                    }
                }
            }
        }
        return false;

   
    }
  
    public Color getSpecialForegroundColor() {
        return Color.WHITE;  // Cambia el color del texto
    }

  
    public Color getSpecialBackroundColor() {
        return Color.RED;  // Cambia el color del fondo
    }

   
    public String getSpecialTooltip() {
        return "Día especial";  // Tooltip opcional
    }

 
    public boolean isInvalid(Date date) {
        return false;
    }

    @Override
    public Color getInvalidForegroundColor() {
        return null;
    }

    @Override
    public Color getInvalidBackroundColor() {
        return null;
    }

    @Override
    public String getInvalidTooltip() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

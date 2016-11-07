/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fctemperature;

/**
 *
 * @author linhdo
 */
public class TemperatureConverting {
    private int celTemp;
    public int getCelTemp(int franTemp){
        return celTemp = (int) ((franTemp - 32)*0.5556);
    }
}

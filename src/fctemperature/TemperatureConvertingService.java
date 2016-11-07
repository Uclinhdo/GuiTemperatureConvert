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
public class TemperatureConvertingService {
    private int celTemp;
    public int getCelTemp(int franTemp) throws IllegalArgumentException{
        //need validate
        if(franTemp < -1000 || franTemp > 1000){
            throw new IllegalArgumentException("Temperature is not valid!");
        }
        return celTemp = (int) ((franTemp - 32)*0.5556);
    }
}

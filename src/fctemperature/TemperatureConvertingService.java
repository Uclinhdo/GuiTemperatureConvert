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
    private int franTemp;
    public int getCelTemp(int franTemp) throws IllegalArgumentException{
        //need validate
        if(franTemp < -459 || franTemp > 1832){
            throw new IllegalArgumentException("Temperature is not valid!");
        }
        return celTemp = (int) ((franTemp - 32)*0.5556);
    }
    public int getFranTemp(int celTemp)throws IllegalArgumentException{
        if(celTemp < -273 || celTemp > 1000){
             throw new IllegalArgumentException("Temperature is not valid!");
        }
        return franTemp = (int)((celTemp * 1.8) + 32 );
    }
}

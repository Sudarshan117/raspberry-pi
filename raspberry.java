
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.RaspiPin;



public class portctrl
{

public static void main(String[] args){
    GpioController gpioController =GpioFactory.getInstance();
    GpioController gpioControl = GpioFactory.getInstance();
    GpioPinDigitalOutput pinout = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_01);
    GpioPinDigitalInput pinin =gpioControl.provisionDigitalInputPin(RaspiPin.GPIO_02);
    System.out.println("________________ \n The light should be blinking");
    while(true){
        
         pinout.low();
         try {
            
              Thread.sleep(500);
            pinout.high();
            Thread.sleep(500);
            }
        catch(Exception e){
            e.printStackTrace();
            }

    }
}
}
    

package fr.lannier.iem.myapp.manager;

import java.util.Random;

import fr.lannier.iem.myapp.devices.Device;

/**
 * Created by iem on 20/10/2017.
 */

public class BLEManager {

    private BLEManager() {
    }

    private static BLEManager instance;

    private Device device;

    public void connect(Device device){
        this.device=device;
    }

    public static BLEManager getInstance() {
        if (instance == null) {
            instance = new BLEManager();
        }
        return instance;
    }

    public String getDeviceName(){
        return this.device.getDeviceName();
    }

    public String getHeartRate(){
        if (this.device!=null){
            return String.valueOf(this.device.getHeartRate());
        }
        else{
            return "No device detected";
        }
    }

}

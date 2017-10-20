package fr.lannier.iem.myapp.manager;

import fr.lannier.iem.myapp.devices.MockBLEDevice;

/**
 * Created by iem on 20/10/2017.
 */

public class BLEManager {

    private BLEManager() {
    }

    private static BLEManager instance;

    private BLEDevice device;

    public void pairDevice(BLEDevice device){
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
            return String.valueOf(device.getHeartRate());
        }
        else{
            return "No device detected";
        }
    }

}

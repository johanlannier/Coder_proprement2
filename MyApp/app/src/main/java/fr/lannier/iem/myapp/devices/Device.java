package fr.lannier.iem.myapp.devices;

import java.util.Random;

/**
 * Created by iem on 20/10/2017.
 */

public class Device {
    private String deviceName;
    private int heartRate;

    public Device(){
        deviceName="Huawei Watch";
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getHeartRate() {
        Random r=new Random();
        heartRate = r.nextInt(20)+65;
        return heartRate;
    }
}

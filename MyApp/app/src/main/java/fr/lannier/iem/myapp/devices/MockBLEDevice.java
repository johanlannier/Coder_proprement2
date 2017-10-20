package fr.lannier.iem.myapp.devices;

import java.util.Random;

import fr.lannier.iem.myapp.manager.BLEDevice;

/**
 * Created by iem on 20/10/2017.
 */

public class MockBLEDevice implements BLEDevice {
    private String deviceName;
    private int heartRate;

    public MockBLEDevice(){
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

package fr.lannier.iem.myapp.manager;

import java.util.Random;

/**
 * Created by iem on 20/10/2017.
 */

public class BLEManager {

    private BLEManager() {
    }

    private static BLEManager INSTANCE = new BLEManager();

    public static BLEManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BLEManager();
        }
        return INSTANCE;
    }

    public static String isConnected(){
        return "Device paired";
    }

    public static int getRate(){
        Random r=new Random();
        return r.nextInt(20)+65;
    }

}

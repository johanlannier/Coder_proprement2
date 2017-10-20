package fr.lannier.iem.myapp;

import android.app.Application;

import fr.lannier.iem.myapp.manager.BLEManager;

/**
 * Created by iem on 20/10/2017.
 */

//INJECTION DE DEPENDANCE

public class IEMApplication extends Application {
    private static IEMApplication application;

    private BLEManager bleManager;

    public static IEMApplication application(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;

        this.bleManager=BLEManager.getInstance();
    }

    public BLEManager getBleManager(){
        return bleManager;
    }
}

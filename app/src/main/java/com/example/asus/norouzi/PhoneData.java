package com.example.asus.norouzi;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;


public class PhoneData {

    private List<Phone> Phones = new ArrayList<Phone>();
    public List<Phone> getPhones(){
        return Phones;
    }

    public PhoneData(){
        addItem(new Phone("Apple iPhone 5s",R.drawable.a,
                "SIM : Nano-SIM /\n" +
                "Size : 4.0 inches /\n" +
                "Resolution : 640 x 1136 pixels /\n" +
                "CPU : Dual-core 1.3 GHz Cyclone /\n" +
                "Internal Memory : 16/32/64 GB, 1GB RAM DDR3 /\n" +
                "OS : iOS7, Upgradable to iOS 8.4 /\n" +
                "Primary Camera : 8 MP, 3264 x 2448 pixels, auto focus, dual LED, flash /\n" +
                "Video : 1080p@30fps, 720p@120fps /\n" +
                "Bluetooth : v4.0, A2DP /\n" +
                "WLAN : Wi-Fi 802.11 a/b/g/n, dual-band, hotspot /\n" +
                "USB : v2.0, reversible connector /\n" +
                "Multi touch : Yes /\n" +
                "Radio : No"));
        addItem(new Phone("HTC One M8s",R.drawable.h,
                "SIM : Nano-SIM /\n" +
                "Size : 5.0 inches /\n" +
                "Resolution : 1080 x 1920 pixels /\n" +
                "CPU : Quad-core 1 GHz Cortex-A53, Quad-core 1.7 GHz Cortex-A57 /\n" +
                "Internal Memory : 16/32 GB, 2GB RAM /\n" +
                "OS : Android OS, v5.0(Lollipop) /\n" +
                "Primary Camera : 13 MP + 2 MP, 4128 x 3096 pixels, autofocus, dual-LED flash /\n" +
                "Video : 1080p@60fps, 720p@120fps, HDR, stereo sound rec. /\n" +
                "Bluetooth : v4.1, A2DP, apt-X /\n" +
                "WLAN : Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot /\n" +
                "USB : microUSB v2.0(MHL TV-out), USB Host /\n" +
                "Multi touch : Yes /\n" +
                "Radio : Stereo FM radio with RDS"));
        addItem(new Phone("Sony Xperia Z2a",R.drawable.s,
                "SIM : Micro-SIM /\n" +
                "Size : 5.0 inches /\n" +
                "Resolution : 1080 x 1920 pixels /\n" +
                "CPU : Quad-core 2.3 GHz Krait 400 /\n" +
                "Internal Memory : 16 GB, 3GB RAM /\n" +
                "OS : Android OS, v4.4.2(KitKat) /\n" +
                "Primary Camera : 20.7 MP, 5248 x 3936 pixels, autofocus, LED flash /\n" +
                "Video : 2160p@30fps, 1080p@60fps, 720p@120fps, HDR /\n" +
                "Bluetooth : v4.0, A2DP, apt-X /\n" +
                "WLAN : Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot /\n" +
                "USB : microUSB v2.0(MHL 3 TV-out), USB Host /\n" +
                "Multi touch : Yes, up to 10 fingers /\n" +
                "Radio : FM radio with RDS"));
    }

    private void addItem(Phone item) {
        Phones.add(item);
    }
}

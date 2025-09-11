public class Tv {
    private int channel;
    private int volumeLevel;
    private boolean on;
    
    Tv() {
        channel = 1;
        volumeLevel = 4;
        on = false;
    }

    public void turnOn() {
        if(!on)  on = true;
    }

    public void turnOff() {
        if(on) on = false;
    }

    public void setChannel(int newChannel) {
        if (on == false) return;
        if (newChannel < 1 || newChannel > 120) return;
        channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        if (on == false) return;
        if (newVolumeLevel < 1 || newVolumeLevel > 7) return;

        volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (on == false) return;
        if (channel == 120) return;
        channel += 1;
    }

    public void channelDown() {
        if (on == false) return;
        if(channel == 1) return;
        channel -= 1;
    }
    
    public void volumeUp() {
        if (on == false) return;
        if (volumeLevel == 7) return;
        volumeLevel += 1;
    }

    public void volumeDown() {
        if (on == false) return;
        if(volumeLevel == 1) return;
        volumeLevel -= 1;
    }
}
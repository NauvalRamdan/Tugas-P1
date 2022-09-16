public class Telpon {
    String receiver, transmiter, dialpad, kabel;

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
 
    public void setTransmiter(String transmiter) {
        this.transmiter = transmiter;
    }
 
    public void setDialpad(String dialpad) {
        this.dialpad = dialpad;
    }
 
    public void setKabel(String kabel) {
        this.kabel = kabel;
    }


    public String getReceiver() {
        return receiver;
    }
 
    public String getTransmiter() {
        return transmiter;
    }
 
    public String getDialpad() {
        return dialpad;
    }
 
    public String getKabel() {
        return kabel;
    }

    void berbunyi( String m ){ 
        System.out.println("kring kring kring "+ m);
    }
    
    void angkat(){ 
        System.out.println("Dengan siapa ini?");
    }
}
public class Hewan {
    String telinga, mata, mulut, hidung, bulu, kaki, ekor;

    public void setTelinga(String telinga) {
        this.telinga = telinga;
}

    public void setMata(String mata) {
        this.mata = mata;
}

    public void setMulut(String mulut) {
        this.mulut = mulut;
}

    public void setHidung(String hidung) {
        this.hidung = hidung;
}

    public void setKaki(String kaki) {
        this.kaki = kaki;
}

    public void setEkor(String ekor) {
        this.ekor = ekor;
}


    public String getTelinga() {
        return telinga;
}

    public String getMata() {
        return mata;
}

    public String getMulut() {
        return mulut;
}

    public String getHidung() {
        return hidung;
}

    public String getKaki() {
        return kaki;
}

    public String getEkor() {
        return ekor;
}

    void bermain(String m){
        System.out.println("mooo"+ m);
}

    void makan(){
        System.out.println("moo mooo");
}

}
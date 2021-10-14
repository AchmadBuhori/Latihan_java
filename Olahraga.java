class Olahraga {
    public String olahraga;
    public String sepak_bola;
    public String bola_tangan;
    public void jenis(){
        System.out.println("=================");
        System.out.println("Macam-Macam Olahraga");
        System.out.println("=================");
    }
    //getter
    public String getOlahraga(){
        return olahraga;
    }
    //Setter
    public void setOlahraga(String newOlahraga){
        this.olahraga = newOlahraga;
    }
}

class Sepak_bola extends Olahraga{
    public void M1 (){
        System.out.println("Turnamen olahraga sepak bola tingkat National");
    }
    public void M2(){
        System.out.println("Turnamen olahraga sepak bola tingkat kampung");
    }
    //getter
    public String getSepak_bola(){
        return sepak_bola;
    }
    //Setter
    public void setSepak_bola(String newSepak_bola){
        this.sepak_bola = newSepak_bola;
    }
}

class Bola_tangan extends Olahraga{
    public void N1(){
        System.out.println("Olahraga bola tangan sedikit peminatnya");
    }
    public void N2(){
        System.out.println("Olahraga bola tangan tidak banyak yang tau");
    }
    //getter
    public String getBola_tangan(){
        return bola_tangan;
    }
    //Setter
    public void setBola_tangan(String newBola_tangan){
        this.bola_tangan = newBola_tangan;
    }
    public static void main(String[] args) {
        Olahraga myOlahraga = new Olahraga();
        Sepak_bola mySepak_Bola = new Sepak_bola();
        Bola_tangan myBola_tangan = new Bola_tangan();
        myOlahraga.jenis();
        mySepak_Bola.M1();
        mySepak_Bola.M2();
        myBola_tangan.N1(); 
        myBola_tangan.N2();
    }
}
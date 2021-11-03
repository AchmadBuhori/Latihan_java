import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    private String[] MyOlahraga = {"Sepak bola","Bola tangan"};
    public List <Olahraga> namaOlahraga1 = new ArrayList<Olahraga>();
    public List <Olahraga> namaOlahraga2 = new ArrayList<Olahraga>();

    public static void main(String[] args) {

        System.out.println("===================================================");
        System.out.println("\t\tJenis - jenis Olahraga");
        System.out.println("===================================================");

        Scanner myObj = new Scanner(System.in);
        Main m = new Main();

        System.out.println("\nPilihlah angka untuk melanjutkan");
        System.out.println("1. Menambahkan jenis Olahraga baru");
        System.out.println("2. Melihat jenis Olahraga");
        System.out.print("\nPilih angka : ");

        String input = myObj.nextLine();
        int code = Integer.parseInt(input);
        System.out.println("===================================================");

        switch (code) {
            case 1:
                m.InputListOlahraga();
                break;
            case 2:
                m.ShowListOlahraga();
                break;

            default:
                System.out.println("Pilihan tidak terdaftar");
                break;
        }

    }

    public void InputListOlahraga(){

        System.out.println("\n---------------------------------------------------");
        System.out.println("\t\tMenambahkan Olahraga");
        System.out.println("---------------------------------------------------\n");
        System.out.println("Pilih jenis Olahraga : ");

        int i=1;
        for (String olahraga : MyOlahraga){
            System.out.println(i + "." + olahraga);
            i++;
        }

        System.out.print("Masukkan pilihan : ");
        Scanner myObj = new Scanner(System.in);

        String inputProduct = myObj.nextLine();
        int product = Integer.parseInt(inputProduct);

        switch (product) {
            case 1:
                try {
                    namaOlahraga1 =  InputOlahragaSB();
                } catch (Exception e) {
                    System.out.println("Gagal untuk menambahkan jenis olahraga");
                    System.out.println("Error: "+e.getMessage());
                }
                break;

            case 2:
                try {
                    namaOlahraga2 =  InputOlahragaBT();
                } catch (Exception e) {
                    System.out.println("Jenis - jenis Olahraga yang sudah ada");
                    System.out.println("Error: "+e.getMessage());
                }
                break;

            default:
                break;

        }

        myObj.close();

    }

    public List InputOlahragaSB() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n============= Jenis olahraga baru =============");

        int jmlData = 2;
        for (int i = 0; i < jmlData; i++) {
            Olahraga O1 = new Olahraga();
            System.out.println("- Jenis ke-" + (i+1) + ":");

            System.out.print("Tempat bermain = ");
            String tempat = myObj.nextLine();
            O1.setTempat(tempat);

            System.out.print("Jenis bola = ");
            String jenis = myObj.nextLine();
            O1.setJenis(jenis);

            System.out.print("cara bermain= ");
            String cara = myObj.nextLine();
            O1.setCara(cara);

            System.out.println("\n");
            this.namaOlahraga1.add(O1);
        }

        System.out.println("\n");
        myObj.close();
        return this.namaOlahraga1;

    }

        public List InputOlahragaBT() {

            Scanner myObj = new Scanner(System.in);
            System.out.println("\n============= Jenis olahraga baru =============");
    
            int jmlData = 2;
            for (int i = 0; i < jmlData; i++) {
                Olahraga O2 = new Olahraga();
                System.out.println("- Jenis ke-" + (i+1) + ":");
    
                System.out.print("Tempat bermain = ");
                String tempat = myObj.nextLine();
                O2.setTempat(tempat);
    
                System.out.print("Jenis bola = ");
                String jenis = myObj.nextLine();
                O2.setJenis(jenis);
    
                System.out.print("cara bermain= ");
                String cara = myObj.nextLine();
                O2.setCara(cara);
    
                System.out.println("\n");
                this.namaOlahraga2.add(O2);
            }

        System.out.println("\n");
        myObj.close();
        return this.namaOlahraga2;

    }

    public void ShowListOlahraga(){

        for (String x : MyOlahraga) {
            System.out.println("Jenis olahraga yang sudah ada yaitu "+ x);
        }

    }

}
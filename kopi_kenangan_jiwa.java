
import java.util.Random;
import java.util.Scanner;


public class kopi_kenangan_jiwa {
    int jummenu = 4;
    static int totalJumlahStokKopi = 1250;
    public static String[] kopi_latte_dont_belate = new String[400];
    public static String[] kopi_goncang_jiwa = new String[300];
    public static String[] kopi_jalan_kenangan = new String[300];
    public static String[] kopi_pahit_tanpa_rasa = new String[250];

    public static void Printpelanggan() {
        int jumlahkopi = 0;
        int totalkopilattedontbelate = 0;
        for (int index = 0; index < kopi_latte_dont_belate.length; index++) {
            if (kopi_latte_dont_belate[index] != null) {
                totalkopilattedontbelate++;
            }
        }
        int totalkopigoncangjiwa = 0;
        for (int index = 0; index < kopi_goncang_jiwa.length; index++) {
            if (kopi_goncang_jiwa[index] != null) {
                totalkopigoncangjiwa++;
            }
        }
        int totalkopijalankenangan = 0;
        for (int index = 0; index < kopi_jalan_kenangan.length; index++) {
            if (kopi_jalan_kenangan[index] != null) {
                totalkopijalankenangan++;
            }
        }
        int totalkopipahittanparasa = 0;
        for (int index = 0; index < kopi_pahit_tanpa_rasa.length; index++) {
            if (kopi_pahit_tanpa_rasa[index] != null) {
                totalkopijalankenangan++;
            }
        }


        jumlahkopi = totalJumlahStokKopi - totalkopilattedontbelate - totalkopigoncangjiwa - totalkopijalankenangan - totalkopipahittanparasa;
        System.out.println("=====================================================");
        System.out.println("---------------- data penjualan kopi ----------------");
        System.out.println("Total pembeli kopilattedontbelate: " + totalkopilattedontbelate );
        System.out.println(" Total pembeli kopigoncangjiwa: " + totalkopigoncangjiwa );
        System.out.println(" Total Pembeli kopipahittanparasa: " + totalkopijalankenangan);
        System.out.println(" Total Pembeli kopijalankenangan" + totalkopipahittanparasa);
        System.out.println("Jumlah Seluruh Pembeli : " + totalJumlahStokKopi);
        System.out.println(" Total Sisa Kopi: " + jumlahkopi);
        System.out.println();
        System.out.println();
    }

    public static void CheckIndexArray(String[] myArray, String pasien) {
        int indexNow = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] != null) {
                indexNow = index + 1;
            }
        }
        if (indexNow < myArray.length) {
            myArray[indexNow] = pasien;
        }
    }

    public static void simpankopi(int angkaRandom, String Kopi) {
        switch (angkaRandom) {
            case 1:
                CheckIndexArray(kopi_latte_dont_belate, Kopi);
                System.out.println("Anda Mendapat Kopi Latte Don't Be Late");
                Printpelanggan();
                break;
            case 2:
                CheckIndexArray(kopi_goncang_jiwa, Kopi);
                System.out.println("Anda Mendapat Kopi Goncang Jiwa");
                Printpelanggan();
                break;
            case 3:
                CheckIndexArray(kopi_pahit_tanpa_rasa, Kopi);
                System.out.println("Anda Mendapat Kopi Pahit Tanpa Rasa");
                Printpelanggan();
                break;
            case 4:
                CheckIndexArray(kopi_jalan_kenangan, Kopi);
                System.out.println("Anda Mendapat Kopi Jalan kenangan");
                Printpelanggan();
                break;
        }
    }

    public static void inputpembeli() {
        Scanner inputData = new Scanner(System.in);
        while (true) {
            System.out.print("Nama Pembeli = ");
            String namaPembeli = inputData.nextLine();
            if (namaPembeli.isBlank()) {
                System.out.println("Nama Pembeli Wajib diisi ");
                inputpembeli();
            } else {
                Random hasilRandom = new Random();
                int jenisRandom = hasilRandom.nextInt(3) + 1;
                simpankopi(jenisRandom, namaPembeli);
            }
        }
    }

    public static void main(String[] args) {
        inputpembeli();
    }
}



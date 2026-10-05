import java.util.Scanner;

public class Latihan2_Nomor3_252205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang = "Y";
        double nilaiTertinggi = 0;
        String stbTertinggi = "";
        String namaTertinggi = "";
        String jurusanTertinggi = "";
        for (int i = 1; ulang.equalsIgnoreCase("Y"); i++) {
            System.out.println("       DATA NILAI MAHASISWA");
            System.out.println("       Data ke-" + i);
            System.out.print("STB     : ");
            String stb = input.nextLine();
            System.out.print("Nama    : ");
            String nama = input.nextLine();
            System.out.print("Jurusan : ");
            String jurusan = input.nextLine();
            System.out.print("Nilai Tugas : ");
            double nt = input.nextDouble();
            System.out.print("Nilai Mid   : ");
            double nm = input.nextDouble();
            System.out.print("Nilai Final : ");
            double nf = input.nextDouble();
            double nilaiAkhir = (0.30 * nt) + (0.30 * nm) + (0.40 * nf);
            String nilaiHuruf;
            if (nilaiAkhir >= 85) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 55) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 40) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            if (i == 1 || nilaiAkhir > nilaiTertinggi) {
                nilaiTertinggi = nilaiAkhir;
                stbTertinggi = stb;
                namaTertinggi = nama;
                jurusanTertinggi = jurusan;
            }
            input.nextLine();
            System.out.println();
            System.out.println("             HASIL DATA MAHASISWA");
            System.out.println("STB         : " + stb);
            System.out.println("Nama        : " + nama);
            System.out.println("Jurusan     : " + jurusan);
            System.out.println("Nilai Tugas : " + nt);
            System.out.println("Nilai Mid   : " + nm);
            System.out.println("Nilai Final : " + nf);
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.print("Apakah mau input data lagi [Y/N] = ");
            ulang = input.nextLine();
            if (ulang.equalsIgnoreCase("N")) {
                System.out.println();
                System.out.println("Program selesai. Terima kasih!");
            } else if (!ulang.equalsIgnoreCase("Y")) {
                System.out.println();
                System.out.println("Input tidak valid. Program selesai.");
                break;
            }
            System.out.println();
        }
        System.out.println("       MAHASISWA DENGAN NILAI TERTINGGI");
        System.out.println("STB         : " + stbTertinggi);
        System.out.println("Nama        : " + namaTertinggi);
        System.out.println("Jurusan     : " + jurusanTertinggi);
        System.out.println("Nilai Akhir : " + nilaiTertinggi);
        input.close();
    }
}
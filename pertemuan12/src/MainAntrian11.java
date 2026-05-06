import java.util.Scanner;
public class MainAntrian11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueSLL11 antrean = new QueueSLL11();
        int pilih;

        do {
            System.out.println("\n===== MENU ANTREAN KEMAHASISWAAN =====");
            System.out.println("1. Tambah Antrean (Enqueue)");
            System.out.println("2. Panggil Antrean (Dequeue)");
            System.out.println("3. Lihat Antrean Pertama & Terakhir");
            System.out.println("4. Cek Jumlah Mahasiswa Mengantre");
            System.out.println("5. Kosongkan Antrean");
            System.out.println("6. Lihat Semua Daftar Antrean");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            if (pilih == 1) { 
                System.out.print("NIM   : "); String nim = sc.nextLine();
                System.out.print("Nama  : "); String nama = sc.nextLine();
                System.out.print("Kelas : "); String kelas = sc.nextLine();
                System.out.print("IPK   : "); double ipk = sc.nextDouble();
                antrean.enqueue(new Mahasiswa11(nim, nama, kelas, ipk));
            } 
            else if (pilih == 2) antrean.dequeue();
            else if (pilih == 3) antrean.peek();
            else if (pilih == 4) {
                System.out.println("Mahasiswa yang masih mengantre: " + antrean.size + " orang.");
            }
            else if (pilih == 5) antrean.clear();
            else if (pilih == 6) antrean.print();

        } while (pilih != 7);
        
        System.out.println("Program Berhenti.");
        sc.close();
    }
    
}

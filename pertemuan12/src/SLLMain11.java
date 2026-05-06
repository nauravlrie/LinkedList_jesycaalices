import java.util.Scanner;

public class SLLMain11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        SingleLinkedList11 sll = new SingleLinkedList11();
        int menu;

        do {
            System.out.println("\n===== MENU MAHASISWA =====");
            System.out.println("1. Tambah (Depan)");
            System.out.println("2. Tambah (Belakang)");
            System.out.println("3. Sisipkan (Setelah Nama)");
            System.out.println("4. Sisipkan (Indeks)");
            System.out.println("5. Cetak List");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            menu = sc11.nextInt();
            sc11.nextLine(); 

            if (menu >= 1 && menu <= 4) {
                System.out.print("NIM   : "); String nim = sc11.nextLine();
                System.out.print("Nama  : "); String nama = sc11.nextLine();
                System.out.print("Kelas : "); String kelas = sc11.nextLine();
                System.out.print("IPK   : "); double ipk = sc11.nextDouble();
                sc11.nextLine(); 

                Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);

                if (menu == 1) sll.addFirst(mhs);
                else if (menu == 2) sll.addLast(mhs);
                else if (menu == 3) {
                    System.out.print("Target Nama: ");
                    String target = sc11.nextLine();
                    sll.insertAfter(target, mhs);
                } else if (menu == 4) {
                    System.out.print("Indeks ke-: ");
                    int idx = sc11.nextInt();
                    sll.insertAt(idx, mhs);
                }
            } else if (menu == 5) {
                sll.print();
            }
        } while (menu != 6);
        
        sc11.close();
    }
}
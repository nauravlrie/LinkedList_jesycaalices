public class QueueSLL11 {
    NodeAntrian11 head, tail;
    int size = 0; //menyimpan jumlah mahasiswa yang mengantre 
    public boolean isEmpty() { //mengecek antrean kosong
        return head == null;
    }

    public void enqueue(Mahasiswa11 data) {  //Menambahkan antrean dari belakang
        NodeAntrian11 newNode = new NodeAntrian11(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void dequeue() { //memanggil antrean keluar dari depan
        if (isEmpty()) {
            System.out.println("Antrean masih kosong!");
        } else {
            System.out.println("Memanggil antrean: " + head.data.nama);
            head = head.next;
            size--;
            if (head == null) tail = null; //setelah dihapus jadi kosong
        }
    }
    public void peek() { //menampilkan antrean terdepan dan paling akhir
        if (!isEmpty()) {
            System.out.println("Antrean paling depan: " + head.data.nama);
            System.out.println("Antrean paling akhir: " + tail.data.nama);
        } else {
            System.out.println("Antrean kosong!");
        }
    }
    public void clear() { //mengosongkan antrean
        head = tail = null;
        size = 0;
        System.out.println("Antrean berhasil dikosongkan.");
    }
    public void print() {  //menampilkan semua yang sedang mengantre
        if (isEmpty()) {
            System.out.println("Tidak ada antrean.");
        } else {
            NodeAntrian11 tmp = head;
            System.out.println("Daftar Antrean:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        }
    }
}

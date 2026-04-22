public class StackSurat {
    Surat04[] stack;
    int top;
    int size;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat04[size];
        top = -1;
    }

    // Terima surat 
    public void push(Surat04 s) {
        if (top == size - 1) {
            System.out.println("Stack penuh!");
        } else {
            stack[++top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        }
    }

    // Proses/verifikasi 
    public void prosesSurat() {
        if (top == -1) {
            System.out.println("Tidak ada surat.");
        } else {
            System.out.println("Memproses surat:");
            stack[top].tampil();
            top--;
        }
    }

    // Lihat surat terakhir (peek)
    public void lihatTerakhir() {
        if (top == -1) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("Surat terakhir:");
            stack[top].tampil();
        }
    }

    // Cari berdasarkan nama
    public void cari(String nama) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampil();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}
Jawaban Pertanyaan 2.1.3
1. Modifikasi
2. Data tugas mahasiswa yang dapat ditampung dalam Stack ditentukan oleh kapasitas (size) yang diberikan saat pembuatan objek stack, yaitu 5 data.
   StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);
   public StackTugasMahasiswa04(int size) {
    this.size = size;
    stack = new Mahasiswa04[size];
    top = -1;
  }
3. Pengecekan kondisi !isFull() pada method push diperlukan untuk memastikan bahwa stack belum penuh sebelum menambahkan elemen baru. Jika if-else dihapus maka akan terjadi ArrayIndexOutOfBoundsException atau program bisa berhenti karena tidak valid.
4. Modifikasi
5. Modifikasi

Jawaban Pertannyaan 2.2.3
1. - StackKonversi04 stack = new StackKonversi04(); membuat stack
   - while (nilai > 0) {
       int sisa = nilai % 2;
       stack.push(sisa);
       nilai = nilai / 2;
      } Ambil sisa pembagian 2 (nilai % 2), simpan ke stack (push), bagi nilai dengan 2 (nilai = nilai / 2), ulangi sampai nilai = 0
   - while (!stack.isEmpty()) {
       biner += stack.pop();
      } Data diambil dari TOP stack
   - return biner; mengembalikan hasil
2. Jika kondisi perulangan diubah menjadi while (kode != 0), maka program akan error karena variabel kode tidak dideklarasikan dalam method tersebut.
   

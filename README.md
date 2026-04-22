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

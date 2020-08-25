// Algoritma
// 1. Mulai
// 2. Menerima input berupa angka dari user
// 3. Membuat Fungsi Pengecekan Angka
//    Jika angka habis dibagi 2 atau genap
//    Maka output       : the number is even
//    Selain dari itu   : the number is odd
// 4. Tampilkan output
// 5. Selesai




fun main() {
    println(cekGanjilGenap(5))
}

fun cekGanjilGenap(angka: Int): String {
    if(angka % 2 == 0) {
        return "The Number is even"
    } else {
        return "The Number is odd"
    }
}
// Algoritma
// 1. Mulai
// 2. Menerima input berupa tahun lahir
// 3. Membuat variabel dengan tahun saat ini yaitu 2020
// 4. Membuat variabel hasil untuk menghitung usia
//    dengan rumus : tahunIni - tahunLahir
// 5. Mengembalikan nilai dari hasil
// 6. Menampilkan output berupa hasil perhitungan usia
// 7. Selesai

fun main() {
    println(menghitungUsia(1996))
}

fun menghitungUsia(tahunLahir: Int): Int {
    var tahunIni = 2020
    var hasil = tahunIni - tahunLahir
    return hasil
}
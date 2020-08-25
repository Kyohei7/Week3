// Algoritma
// 1. Mulai
// 2. Menerima input dari user berupa jari-jari
// 3. membuat variabel berupa nilai pi yaitu 3.14 dengan    //    tipe data yang akan ditampilkan berupa double
// 4. Membuat variabel luas dengan menampung isi rumus luas //    lingkaran yaitu : Luas = pi x jari x jari
// 5. Mengembalikan nilai luas
// 6. menampilkan hasil dari luas



fun main() {
    println(menghitungLuasLingkaran(2))
}

fun menghitungLuasLingkaran(jari: Int): Double {
    var pi = 3.14
    var luas = pi * jari * jari
    return luas
}
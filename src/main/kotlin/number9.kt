// Algoritma
// 1. Mulai
// 2. Menerima input berupa angka
// 3. membuat variabel hasil dengan tipe data String

// 4. Membuat fungsi untuk melakukan perulangan dengan

//    kondisi i dari 1 sampai angka

//    JIKA memenuhi kondisi perulangan i, MAKA masuk keDalam kondisi perulangan
//    selanjutnya yaitu j dari 0 sampai angka-i

//    JIKA memenuhi kondisi j, MAKA isi variabel Hasil += j+1

//    JIKA TIDAK memenuhi kondisi perulangan j, MAKA isi variabel Hasil += "\n"

//    JIKA TIDAk memenuhi kondisi perulangan i, MAKA  return variabel hasil

// 5. Selesai


fun main() {

    println(segitiga(5))

}

fun segitiga(angka: Int): String {
    var hasil: String = ""

    for(i in 1..angka) {
        for(j in 0..angka-i) {
            hasil += j+1
        }
        hasil += "\n"
    }
    return hasil
}
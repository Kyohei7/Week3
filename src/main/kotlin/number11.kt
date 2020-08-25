// Algoritma
// 1. Mulai
// 2. Menerima input teksAwal
// 3. membuat variabel teksDibalik = ""
// 4. membuat variabel panjangTeksAwal = teksAwal.length
// 5. melakukan perulangan
// 6. melakukan pengecekan JIKA
// 7. Tampilkan Hasil
// 8. Selesa


fun main(args: Array<String>) {
    val teksAwal = "Malam"

    var teksDibalik = ""
    var panjangTeksAwal = teksAwal.length

    for (i in (panjangTeksAwal - 1) downTo 0) {
        teksDibalik = teksDibalik + teksAwal[i]
    }

    if (teksAwal.equals(teksDibalik, ignoreCase = true)) {
        println("Palindrome")
    } else {
        println("Bukan Palindrome")
    }
}
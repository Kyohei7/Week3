// Algoritma
// 1. Mulai
// 2. Menerima input angka
// 3. membuat variabel angka untuk merubah menjadi toLong
// 4. membuat variabel string angka untuk merubah menjadi string
// 5. membuat variabel arrayAngka untuk melakukan split dengan parameter angka 0
// 6. melakukan perulangan dengan ketentuan i in 0.. ukuran stringAngka dikurangi 1
// 7. lalu membuat variabel x dengan arrayAngka[i].split
// 8. membuat variabel y dengan : x.sorted.joinToString.int
// 9. mencetak nilai y
// 10. selesai



fun main() {
    println("Masukkan angka:")

    var angka = readLine()!!.toLong()

    var stringAngka = angka.toString()

    var arrayAngka = stringAngka.split("0")

    for (i in 0..arrayAngka.size-1) {
        var x= arrayAngka[i].split("")
        var y= x.sorted().joinToString("").toInt()
        print(y)
    }
}
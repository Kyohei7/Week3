// Algoritma
// 1. Mulai
// 2. Membuat variabel yang menampung text
// 3. Membuat variabel untuk melakukan pembalikan pada text
// 4. Cetak hasilnya
// 5. Selesai

fun main(){
    val text="saya belajar javascript"
    println(text)

    val reversed : String = text.split(" ").reversed().joinToString(" ")
    println(reversed)
}
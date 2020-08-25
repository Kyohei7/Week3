// Algortima
// 1. Mulai
// 2. Menerima Input berupa nilai dari alas & tinggi
// 3. Melakukan perhitungan luas dengan rumus : a x t : 2
// 4. Menampilkan out berupa nilai luas
// 5. Selesai



fun main() {
    println(menghitungLuasSegitiga(2,2))
}

fun menghitungLuasSegitiga(alas: Int, tinggi: Int): Int {
    var luas = alas * tinggi / 2
    return luas
}
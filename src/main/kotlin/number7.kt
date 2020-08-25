// Algoritma
// 1. Mulai
// 2. Menerima input tahun dari user
// 3. Membuat Perkondisian yang menjelaskan bahwa :
//    a. Jika tahun itu habis dibagi 400, maka tahun itu
//       tahun kabisat
//    b. Jika tahun itu tidak habis dibagi 400 tetapi        //       habis dibagi 100, maka tahun itu bukan            //       merupakan tahun kabisat.
//    c. Jika angka tahun itu tidak habis dibagi 400, tidak //       habis dibagi 100 akan tetapi habis dibagi 4, maka //       tahun itu tahun kabisat.
//    d. Jika angka tahun tidak habis dibagi 400, tidak      //       habis dibagi 100, dan tidak habis dibagi 4, maka    //       tahun tersebut bukan tahun kabisat.
// 4. Menampilkan output hasil dari pengecekan
// 5. Selesai


fun main() {
    println(tahunKabisat(2018))
}

fun tahunKabisat(tahun: Int): String {
    if (tahun % 4 == 0) {
        return "Tahun Kabisat"
    } else if (tahun % 100 == 0) {
        return "Bukan Tahun Kabisat"
    } else if (tahun % 400 == 0) {
        return "Tahun Kabisat"
    } else {
        return "Bukan Tahun Kabisat"
    }
}
// Algoritma
// 1. Mulai
// 2. menerima input kalimat
// 3. membuat variavek vocal & konstanta dengan ""
// 4. melakukan split & mengubah kalimat menjadi array
// 5. melakukan perulangan jika x in 0.. panjang kalimat
//    melakukan pengecekan jika pada kalimat terdapat huruf //    vocal maka cetak huruf vocal terlebih dahulu selain    //    itu cetak huruf konstanta nya



fun cekKalimat (kalimat:String) {
    var vocal = ""
    var konstanta = ""
    var arrayKata = kalimat.split("").toTypedArray()
    for (x in 0..kalimat.length) {
        if (arrayKata[x].equals("A") || arrayKata[x].equals("I") || arrayKata.equals("U") || arrayKata[x].equals("E") || arrayKata[x].equals("O"))
        {
            vocal += arrayKata[x] + "\n"
        } else {
            konstanta += arrayKata[x] + "\n"
        }
    }
    print(vocal)
    print(konstanta)
}

fun main (){
    cekKalimat("ARKADEMY")
}
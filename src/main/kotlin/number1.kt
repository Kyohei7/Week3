// Algoritma
// 1. Mulai
// 2. membuat variabel :
//    x = 10 , y = 20, z = 0
// 3. mendefinisikan bahwa
//    z = x , x = x + x , y = y - z
// 4. mencetak nilai x dan y
// 5. selesai


fun main(){
    var x:Int = 10
    var y:Int = 20
    var z:Int = 0

    z = x
    x = x + x
    y = y - z


    println("X = " + x)
    println("Y = " + y)
}
// Algoritma
// 1. Mulai
// 2. Menerima Input dari user berupa nilai dari :
//    - Matematika
//    - Bahasa Indonesia
//    - Bahasa inggris
//    - ipa
// 3. Membuat Variabel nilai untuk menghitung rata2 nilai dengan rumus :
//    matematika + bahasa indonesia + bahasa inggris + ipa dibagi 4
// 4. menampilkan output dari hasil rata2
// 5. membuat perkondisian dengan ketentuan :
//    a. Jika nilai kurang dari sama dengan 59 Maka Grade E
//    b. Jika nilai kurang dari sama dengan 69 Maka Grade D
//    c. Jika nilai kurang dari sama dengan 79 Maka Grade C
//    d. Jika nilai kurang dari sama dengan 89 Maka Grade B
//    e. Jika nilai kurang dari sama dengan 100 Maka Grade A
//    selain dari itu tidak ada grade
// 6. tampilkan hasil dari pengecekan tersebut
// 7. selesai


fun main() {

    println(cekGrade(80,90,89,69))
}

fun cekGrade(mtk: Int, indo: Int, inggris: Int, ipa: Int): String {
    val nilai = (mtk + indo + inggris + ipa) / 4
    println("Rata - rata = " + nilai)

    if (nilai <= 59) {
        return "Grade = E"
    } else if (nilai <= 69) {
        return "Grade = D"
    } else if (nilai <= 79) {
        return "Grade = C"
    } else if (nilai <= 89) {
        return "Grade = B"
    } else if (nilai <= 100) {
        return "Grade = A"
    } else {
        return "Tidak ada grade"
    }
}
fun main() {
    val scores = mutableMapOf<Int, Int>(
        24523001 to 85,
        24523002 to 90,
        24523003 to 78
    )

    scores[24523001] = 95

    scores.remove(24523003)

    println("Daftar Nilai Mahasiswa:")
    for ((nim, score) in scores) {
        println("NIM: $nim -> Nilai: $score")
    }

    println("\nCari NIM 24523149: ${scores[24523149]}") 
}
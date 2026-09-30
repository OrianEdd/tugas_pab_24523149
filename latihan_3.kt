fun main() {
    val skills = mutableSetOf("Kotlin", "Java")
    
    skills.add("Python")
    skills.add("Kotlin")
    
    println("Ukuran Set: ${skills.size}")
    
    println("Apakah Swift ada? ${"Swift" in skills}")
    println("Apakah Python ada? ${"Python" in skills}")
}
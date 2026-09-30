object AppConfig {
    const val MAX_COURSES = 5
}

enum class CourseStatus { ACTIVE, COMPLETED, DROPPED }

data class Course(val code: String, val name: String, val status: CourseStatus) {
    companion object {
        const val PREFIX = "PAB"
    }
}

fun describe(status: CourseStatus): String = when (status) {
    CourseStatus.ACTIVE -> "Currently studying"
    CourseStatus.COMPLETED -> "Finished"
    CourseStatus.DROPPED -> "Dropped out"
}

fun Course.displayInfo(): String = "$code - $name - $status"

fun MutableList<Course>.addCourse(course: Course): Boolean {
    return if (this.size < AppConfig.MAX_COURSES && course.code.startsWith(Course.PREFIX)) {
        this.add(course)
        true
    } else {
        false
    }
}

fun main() {
    val courses = mutableListOf<Course>()
    
    courses.addCourse(Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE))
    courses.addCourse(Course("PAB102", "Cybersecurity", CourseStatus.COMPLETED))
    courses.addCourse(Course("PAB103", "Big Data", CourseStatus.DROPPED))
    
    println("Daftar Mata Kuliah dan Deskripsi Status:")
    for (course in courses) {
        val deskripsi = describe(course.status)
        println(course.displayInfo() + " | Keterangan: $deskripsi")
    }
}
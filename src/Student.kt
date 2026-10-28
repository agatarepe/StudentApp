class Student(
    val id: String,
    val name: String,
    val course: String
) {

    var mark: Double = 0.0
        set(value) {
            if (value in 0.0..100.0) {
                field = value
            }
        }

    fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2/1"
            mark >= 50 -> "2/2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }

    fun didPass(): Boolean {
        return mark >= 40
    }

    override fun toString(): String {
        return "Name: $name Course: $course Mark: $mark"
    }
}
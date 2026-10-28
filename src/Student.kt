abstract class Student(
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

    abstract fun getGrade(): String

    fun didPass(): Boolean {
        return mark >= 40
    }

    override fun toString(): String {
        return "Name: $name Course: $course Mark: $mark"
    }
}
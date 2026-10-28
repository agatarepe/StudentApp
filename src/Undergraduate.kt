class Undergraduate(
    id: String,
    name: String,
    course: String
) : Student(id, name, course) {

    override fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2/1"
            mark >= 50 -> "2/2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }
}
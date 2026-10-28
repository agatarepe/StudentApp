class Masters(
    id: String,
    name: String,
    course: String
) : Student(id, name, course) {

    override fun getGrade(): String {
        return when {
            mark >= 70 -> "Distinction"
            mark >= 60 -> "Merit"
            mark >= 40 -> "Pass"
            else -> "Fail"
        }
    }
}
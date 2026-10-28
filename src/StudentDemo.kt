fun main() {

    while (true) {
        print("Enter student name (or quit to exit): ")
        val name = readln()

        if (name.equals("quit", ignoreCase = true)) {
            break
        }

        print("Enter student ID: ")
        val id = readln()

        print("Enter course: ")
        val course = readln()

        print("Student type (1 = Undergraduate, 2 = Masters): ")
        val type = readln()

        val student: Student = when (type) {
            "1" -> Undergraduate(id, name, course)
            "2" -> Masters(id, name, course)
            else -> {
                println("Invalid student type.")
                continue
            }
        }

        print("Enter mark (0-100): ")
        val mark = readln().toDoubleOrNull()

        if (mark == null) {
            println("Invalid mark.")
            continue
        }

        student.mark = mark

        println()
        println("Student Status")
        println("--------------")
        println(student)
        println("Grade: ${student.getGrade()}")
        println("Passed: ${student.didPass()}")
        println()
    }

    println("Program finished.")
}
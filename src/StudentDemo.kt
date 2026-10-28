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

        val student = Student(id, name, course)

        print("Enter mark (0-100): ")
        val inputMark = readln().toDoubleOrNull()

        if (inputMark == null) {
            println("Invalid number. Please try again.")
            continue
        }

        student.mark = inputMark

        println()
        println("Student Status")
        println("--------------")
        println(student)
        println("Mark: ${student.mark}")
        println("Grade: ${student.getGrade()}")
        println("Passed: ${student.didPass()}")
        println()
    }

    println("Program finished.")
}
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

        print("Enter mark: ")
        val mark = readln().toDoubleOrNull()

        if (mark == null) {
            println("Invalid mark. Please try again.")
            continue
        }

        val student = Student(id, name, course, mark)

        println(student)
        println()
    }

    println("Program finished.")
}
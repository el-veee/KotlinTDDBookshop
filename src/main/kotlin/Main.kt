
fun main() {

    val codeSubOne = CodeSubmission("New Video Streaming", 10)
    val codeSubTwo = CodeSubmission("Red interface", 18)
    val codeSubThree = CodeSubmission("GraphQL api", 89)

    val bestCodeSubmissionsMap = listOf(codeSubOne, codeSubTwo, codeSubThree)
        .sortedByDescending { it.votes }
        .groupBy { it.votes }

    println(bestCodeSubmissionsMap)

    println(bestCodeSubmissionsMap[90])

}
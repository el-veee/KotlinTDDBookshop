
fun String.getUrlId():String {

    val input = this
    val splitInput = input.split("/")

    val firstInputElement = splitInput.first()

    if (!firstInputElement.contains("https") || !firstInputElement.contains("http")) {
        throw InvalidUrlException("No HTTP or HTTPS")
    }

    val urlID = splitInput.last()

    if (!urlID.all { it.isLetter() }) {
        throw InvalidUrlException("Invalid url ID found in $urlID")
    }

    return urlID
}

class InvalidUrlException(message: String): Exception(message) {


}
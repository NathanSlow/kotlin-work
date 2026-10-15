// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(doc:String, redactedInfo:String, redactChar: Char = 'X'): String {
    var redactionString = ""
    redactedInfo.forEach {
        redactionString = redactionString + redactChar
    }
    return  doc.replace(redactedInfo, redactionString)
}
var lengthOfLastWord = function (s) {
    let n = s.length - 1
    let length = 0
    while (n >= 0) {
        if (s.charAt(n) != " ") {
            length++
            if (s.charAt(n - 1) == " ") {
                break
            }
        }
        n--
    }
    return length
};
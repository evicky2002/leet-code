var lengthOfLastWord = function (s) {
    var arr = s.split(" ")
    let n = arr.length - 1
    while (n >= 0) {
        if (arr[n] != "") {
            return arr[n].length
        }
        n--
    }
};
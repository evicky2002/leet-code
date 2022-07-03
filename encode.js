var encode = function (longUrl) {
    var asciiSequence = "";
    for (let i = 0; i < longUrl.length; i++) {
        asciiSequence += longUrl.charCodeAt(i)
        asciiSequence += String.fromCharCode(123)
    }

    return "http://tinyurl.com/" + asciiSequence

};

var decode = function (shortUrl) {
    var asciiSequence = "";
    for (let i = 19; i < shortUrl.length - 1; i++) {
        asciiSequence += shortUrl[i]
    }
    var array = asciiSequence.split('{')
    var temp = ""
    for (let i = 0; i < array.length; i++) {
        temp += String.fromCharCode(array[i])
    }
    return temp
};
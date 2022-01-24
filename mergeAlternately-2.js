var mergeAlternately = function(word1, word2) {
    var result = []
    var i = 0
    while(i <= 100){
        if(i<word1.length){
            result.push(word1.charAt(i))
        }
        if(i<word2.length){
            result.push(word2.charAt(i))
        }
        i++
    }
        return result.join("")
    };
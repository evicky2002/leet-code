var mergeAlternately = function(word1, word2) {
    const result = []
    var array1 = []
    var array2 = []
    for(let i = 0; i < word1.length; i++){
        array1.push(word1.charAt(i))
    }
    for(let j = 0; j < word2.length; j++){
        array2.push(word2.charAt(j))
    }
    var max = word1.length
    var min = word2.length
    if(word2.length>max){
        max = word2.length
        min = word1.length
    }
    for(let k = 0; k<max; k++ ){
        if(word1.length===max){
            result.push(array1[k])
            if(k<min){
                result.push(array2[k])
            }
        }else{
            if(k<min){
                result.push(array1[k])
            }
            result.push(array2[k])
        }
    
    }
        return result.join("")
    
    };
var sortSentence = function(s) {
    var array = s.split(" ")
    do{
        isSwapped = false
        for(let i=0;i<array.length-1;i++){ 
            if(array[i].charAt(array[i].length-1)>array[i+1].charAt(array[i+1].length-1)){
                temp = array[i+1]
                array[i+1]=array[i]
                array[i]=temp      
                isSwapped = true      
            }
        }

    }while(isSwapped)
    var str = array.join(" ")
    var result = str.replace(/[0-9]/g,'')
    return result
};
var fib = function(num) {
     if(num == 0){
        return 0
    }else{
        var firstNumber = 0
        var secondNumber = 1
        var result = firstNumber + secondNumber
        for(let i = 2; i < num; i++){
            firstNumber = secondNumber
            secondNumber = result
            result = firstNumber + secondNumber
        }
        return result
    }
};
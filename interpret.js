var interpret = function (command) {
    let result = ""
    for (let i = 0; i < command.length; i++) {
        console.log(i)
        if (command[i] == "G") {
            result += command[i]
        }
        if (command[i] == '(') {
            if (i < command.length - 1) {
                if (command[i + 1] == ')') {
                    result += 'o'
                    i++
                } else if (command[i + 1] == 'a') {
                    result += "al"
                    i += 3
                }
            }
        }
    }
    return result
};
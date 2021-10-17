import java.util.*

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var mutableList = mutableListOf<Int?>()
        var singleNumber = 0
        var length = nums.size
        if (length == 1) {
            return nums[0]
        } else {
            var i = 0
            while (i < length) {
                var number = nums[i]
                var j = 0
                while (j < length) {
                    if (j != i) {
                        if (number == nums[j]) {
                            mutableList.add(number)
                            break
                        }
                    }

                    j++
                }
                i++
            }
            var x = 0
            var y = 0
            while (x < length) {

                while (y < mutableList.size) {
                    if (nums[x] == mutableList[y]) {
                        singleNumber = 0
                        break
                    } else {
                        singleNumber = nums[x]
                    }
                    y++
                }
                x++
            }
        }
        return singleNumber
    }
}
package solutions

class ReverseInteger {
    fun reverse(x: Int): Int {
        var value = x
        var result = 0
        while (value != 0) {
            //Get the last number
            val lastNo = value % 10
            //multiply previous result by 10 and add to last no
            val newResult = result * 10 + lastNo
            //Verification check to know if x is a 32 bit signed integer
            //We are to return zero if not
            if((newResult - lastNo)/10 != result) return 0
            result = newResult
            //remove the last number
            value /= 10
        }
        return result
    }
}
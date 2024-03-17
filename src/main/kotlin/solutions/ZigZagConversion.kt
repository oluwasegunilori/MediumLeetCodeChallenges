package solutions

class ZigZagConversion {

    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s
        //initialize StringBuilders
        val builders = Array(numRows) { StringBuilder() }
        var incre = 1
        var index = 0
        for (element in s) {
            builders[index].append(element)
            //increase index with positive increase
            if (index == 0) incre = 1
            //reduce index with negative increase
            if (index == numRows - 1) incre = -1
            index += incre
        }
        return builders.joinToString(separator = "") { it.toString() }
    }
}
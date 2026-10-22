fun median(nums:List<Float>):Float {
    require(nums.isNotEmpty())
    if (nums.size % 2 > 0) {
        //odd so do the middle number
        
        val middlePos = nums.size / 2 // integer division so this just works
        val sortedList = nums.sorted()
        return sortedList[middlePos]
        //check for low scenarios, list.size 1 /2 = 0.5 so we would have to round down here( and for all of them actually)
    } else {
        //we need to get both the middle values. we can get them by splitting the array(we can assume no arrays 
        //of 0 length are going to be given I assume so if we just split it and then go one below the split value it should be the middle 2)
        //i forgot about sorting the array in both tho
        val middlePos = nums.size / 2
        val sortedList = nums.sorted()
        return (sortedList[middlePos - 1] + sortedList[middlePos])/2f
    }
}// Task 7.7.1: statistics functions

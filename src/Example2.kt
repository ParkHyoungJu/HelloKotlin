import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner
import java.util.StringTokenizer

fun main(args:Array<String>){
//		val br = BufferedReader(InputStreamReader(System.`in`))
//		val token = StringTokenizer(br.readLine())
//		println(Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken()))
//		br.close()
		
		var a = twoSum(intArrayOf(1,3,5,7,9), 14)
		a.forEach { println(it) }
	}
	
	fun twoSum(nums:IntArray, target:Int):IntArray{
		for(i in 0..nums.size - 2){
			for(j in i+1..nums.size - 1){
				if(nums[i] + nums[j] == target){
					return	intArrayOf(i, j)
				}
			}
		}
		
		return nums
	}
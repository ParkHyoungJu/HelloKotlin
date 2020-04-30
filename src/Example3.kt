import java.util.Scanner

fun main(args:Array<String>){
	var ttt = Scanner(System.`in`)
	ex(ttt.next())
}
	
// 문자열을 입력받아서 연속된 문자열중 최대길이 체크 
fun ex(s:String){
	var best = ""
	var curr = ""
	
	for(c in s){
		if(c in curr){
			//1. 최대길이와 현재길이 비교
			if(curr.length > best.length){
				best = curr
			}
			
			curr = "" + c
		}else{
			curr += c
			if(curr.length > best.length){
				best = curr
			}
		}
	}
	
	println(best)
	println(best.length)
}
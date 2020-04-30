import java.lang.NumberFormatException
import javafx.scene.shape.Rectangle

fun main(args: Array<String>){
	println("Hello Kotlin")
	println(sum(1, 3))
	println(sum1(2, 8))
	printSum(5,7)
	printSum(12,15)
	
	var a = 1
	// 템플릿내의 단순한 이름
	val s1 = "a is $a"
	a = 2
	// 템플릿내의 임의 표현식:
	val s2 = "${s1.replace("is", "was")}, but now is $a"
	
	println(s1)
	println(s2)

	val items = listOf("Apple", "Banana", "kiwi")
	
	for(item in items){
		println(item)
	}
	
	for(index in items.indices){
		println("${items[index]} is index $index")
	}
	
	var exIndex = 0
	while(exIndex < items.size){
		println("${items[exIndex]} is index $exIndex")
		exIndex++
	}
	
	val x = 11
	val y = 9
	
	if(x in 1..y+1){
		println("YES")
	}else{
		println("NO")
	}
	
	for (z in 1..10 step 2) { 
      println(z) 
	}
	
    for (z in 9 downTo 0 step 3) {
      println(z)
    }
	
	val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
	fruits
		.filter { it.startsWith("a") }
		.sortedBy { it }
		.map { it.toUpperCase() }
		.forEach { println(it) }
	
	val rec = Rectangle(5.0, 2.0)
}

fun sum(a:Int, b:Int):Int{
	return a + b
}
	
fun sum1(a:Int, b:Int) = a+b

fun printSum(a: Int, b: Int): Unit {
	println("sum of $a and $b is ${a + b}")
}

fun printSum1(a: Int, b: Int) {
	println("sum of $a and $b is ${a + b}")
}

fun maxOf(a:Int, b:Int): Int{
	if(a > b){
		return a
	}else{
		return b
	}
}

fun maxOf1(a:Int, b:Int) = if(a>b) a else b

fun parseInt(s:String):Int?{
	try{
		return s.toInt()
	}catch(e: NumberFormatException){
		print(e)
		return null
	}
}

fun getStringLength(obj:Any):Int?{
	if(obj is String){
		return obj.length
	}else{
		return null
	}
}

fun getStringLength1(obj:Any):Int?{
	if(obj !is String) return null
	
	return obj.length
}

// switch 문과 거의 동일
fun describe(obj: Any): String =
	when(obj){
		1 -> "One"
		"Hello" -> "Greeting"
		is Long -> "Long"
		!is String -> "Not a string"
		else -> "Unknown"
}
fun main() {

var x=modulus(20,3)
    println(x)
    var y=statement("Joy",22)
    println(y)
    var z=name("Mango")
    println(z.length)
    println(name())


}

fun modulus(num1: Int,num2: Int){
    var number=num1%num2
    println(number)
}
fun statement(p: String,z: Int): String{
    var sentence="Hi my name is $p and I am $z years old"
    return sentence
}
fun name(name:String):String{
    return name

}
fun name(){
    var word="codeHive"
    println(word[5])
    println(word[6])
    println(word[7])
    println(word[8])
}
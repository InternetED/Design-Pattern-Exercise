package kotlin.dip

/**
 *@date: 2019/1/6 : 下午 04:45
 *@author: Ed
 *@email: salahayo3192@gmail.com
 *
 **/
fun main(args: Array<String>) {
    println("this is DIP Main method")
    val mother = Mother()
    mother.read(Newspaper())
    mother.read(Book())


}
package create.abstrtact.factory

/**
 *@data: 2019/1/14 : 下午 10:33
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
fun main(args: Array<String>) {

    val acerSupplier = AcerSupplier()
    val acerComputer = acerSupplier.produceComputer()
    println(acerComputer.getName())

    val asusSupplier = AsusSupplier()
    val asusComputer = asusSupplier.produceComputer()

    println(asusComputer.getName())
}
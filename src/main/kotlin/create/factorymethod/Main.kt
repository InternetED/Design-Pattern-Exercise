package create.factory

import create.factory.Impl.supplier.AcerSupplier
import create.factory.Impl.supplier.AsusSupplier

/**
 *@data: 2019/1/14 : 下午 10:33
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
fun main() {

    // 兩個供應商皆有提供販售電腦的服務
    val acerSupplier: Supplier = AcerSupplier()
    val asusSupplier: Supplier = AsusSupplier()

    // 不需要得知供應商是誰，只需請供應商提供電腦即可
    val acerComputer: Computer = acerSupplier.produceComputer()
    val asusComputer: Computer = asusSupplier.produceComputer()


    println(acerComputer.getSuppliersName())
    println(asusComputer.getSuppliersName())
}
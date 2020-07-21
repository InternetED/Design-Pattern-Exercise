package create.factory.Impl.supplier

import create.factory.Computer
import create.factory.Supplier
import create.factory.Impl.computer.AcerComputer

/**
 *@data: 2019/1/14 : 下午 10:35
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class AcerSupplier : Supplier {
    override fun produceComputer(): Computer = AcerComputer()
}
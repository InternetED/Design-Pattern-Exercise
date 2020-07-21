package create.factory.Impl.supplier

import create.factory.Computer
import create.factory.Supplier
import create.factory.Impl.computer.AsusComputer

/**
 *@data: 2019/1/14 : 下午 10:35
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class AsusSupplier : Supplier {
    override fun produceComputer(): Computer = AsusComputer()
}
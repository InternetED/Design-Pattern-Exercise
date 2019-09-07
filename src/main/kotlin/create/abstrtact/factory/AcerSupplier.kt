package create.abstrtact.factory

import create.abstrtact.factory.Impl.IComputer
import create.abstrtact.factory.Impl.ISupplier

/**
 *@data: 2019/1/14 : 下午 10:35
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class AcerSupplier : ISupplier {
    override fun produceComputer(): IComputer = AcerComputer()
}
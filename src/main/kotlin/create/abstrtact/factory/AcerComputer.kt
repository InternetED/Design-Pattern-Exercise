package create.abstrtact.factory

import create.abstrtact.factory.Impl.IComputer


/**
 *@data: 2019/1/14 : 下午 10:33
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class AcerComputer : IComputer {
    override fun getName(): String = "Acer's Computer"
}
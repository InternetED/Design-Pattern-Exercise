package behavior.observer.observers

import behavior.observer.Observer

/**
 *@date: 2019/9/8 : 上午 11:15
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class ObserverTwo() : Observer{
    override fun notice() {
        println("two 我被通知")
    }
}
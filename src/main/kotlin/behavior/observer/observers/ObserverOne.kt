package behavior.observer.observers

import behavior.observer.Observer
import java.util.*

/**
 *@date: 2019/9/8 : 上午 11:15
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/

class ObserverOne() : Observer {
    override fun notice() {
        println("one 我被通知")
    }
}

package behavior.observer.target

import behavior.observer.ObservationTarget
import behavior.observer.Observer

/**
 *@date: 2019/9/8 : 上午 11:18
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class ObservationTarget : ObservationTarget {


    override val observers: MutableList<Observer> = mutableListOf()

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun noticeAll() {
        println("通知所有人")
        println("通知人數：${observers.size}")
        println("--------------------")

        observers.forEach {

            it.notice()
        }
    }

}
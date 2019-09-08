package behavior.observer

/**
 *@date: 2019/9/8 : 上午 11:13
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
interface ObservationTarget {

    val observers: MutableList<Observer>


    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun noticeAll()

}
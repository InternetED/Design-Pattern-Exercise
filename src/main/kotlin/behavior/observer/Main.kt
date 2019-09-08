package behavior.observer

import behavior.observer.observers.ObserverOne
import behavior.observer.observers.ObserverTwo
import behavior.observer.target.ObservationTarget
import kotlin.properties.Delegates

/**
 *@date: 2019/9/8 : 上午 11:21
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/

fun main() {

    // 一般實現

    val observer1 = ObserverOne()
    val observer2 = ObserverTwo()

    val observationTarget = ObservationTarget()

    observationTarget.addObserver(observer1)
    observationTarget.addObserver(observer2)

    observationTarget.noticeAll()


    // Kotlin 提供的方法實現


    val observerDelegate1 by Delegates.vetoable(5, { property, oldValue, newValue ->
        println("Old value : $oldValue")
        println("Nex value : $newValue")

        // if oldValue more than the newValue ,so can execute it
        // otherwise don't execute it
        oldValue > newValue
    })


    val observerDelegate by Delegates.observable(5, { property, oldValue, newValue ->
        println("Old value : $oldValue")
        println("Nex value : $newValue")
    })


}
package kotlin.lkp

/**
 *@date: 2019/1/6 : 下午 08:16
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class KFC {

    fun sell(): Hamburger {
        val beef = Beef()
        val bread = Bread()
        val vegetable = Vegetable()
        val hamburger = Hamburger(beef, vegetable, bread)
        println("KFC sell a hamburger")
        return hamburger
    }
}
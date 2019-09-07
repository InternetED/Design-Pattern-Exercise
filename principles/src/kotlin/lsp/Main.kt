package kotlin.lsp

/**
 *@date: 2019/1/6 : 下午 04:27
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
fun main(args: Array<String>) {
    println("this is main method")
    val soldier = Soldier()
    soldier.killEnemy(Rifle())
    soldier.killEnemy(HandGun())
//    soldier.killEnemy(ToyGun()) 將編譯不過，因為不是武器槍
}
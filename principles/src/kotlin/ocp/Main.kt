package kotlin.ocp

/**
 *@date: 2019/1/6 : 下午 04:13
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/

fun main(args: Array<String>) {
    println("this is OCP main method")

    val manager = ChartDisplayManager()
    manager.display(LineChart())
    manager.display(PieChart())
    manager.display(BarChart())
}
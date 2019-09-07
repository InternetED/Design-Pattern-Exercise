package kotlin.srp

/**
 *@date: 2019/1/6 : 下午 03:52
 *@author: Ed
 *@email: salahayo3192@gmail.com
 *
 **/
fun main(args: Array<String>) {

    println("this is SRP main method")
    // 背景 :　一個客戶管理系統，需生成客戶表的工具
    // 假設數據庫發生變化
    val customerChart = CustomerChart()
    customerChart.setDao(CustomerDao())

    println(customerChart.displayChart())


}

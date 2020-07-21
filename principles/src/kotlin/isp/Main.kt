package kotlin.isp

/**
 *@date: 2019/1/6 : 下午 06:55
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
fun main(args: Array<String>) {
    println("this is ISP main method")

    val searcher = Searcher()
    searcher.searchActress(AngelaBaby())
    println("--------------")
    val searcherB = SearcherB()
    searcherB.searchSuperModel(AngelaBaby())
}
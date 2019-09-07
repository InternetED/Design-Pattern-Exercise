package kotlin.srp

/**
 *@date: 2019/1/6 : 下午 03:52
 *@author: Ed
 *@email: salahayo3192@gmail.com
 *
 * 將用戶信息展現出來，而不需關心數據來源
 **/
class CustomerChart {

    private var dao: CustomerDao? = null
    fun setDao(dao: CustomerDao) {
        this.dao = dao
    }

    fun displayChart() {

        val customers = dao?.findCustomers()

        customers?.forEach {
            println(it)
        }
    }
}
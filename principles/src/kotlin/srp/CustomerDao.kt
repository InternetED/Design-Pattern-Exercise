package kotlin.srp

import java.util.ArrayList

/**
 *@date: 2019/1/6 : 下午 03:58
 *@author: Ed
 *@email: salahayo3192@gmail.com
 *
 * 數據來源
 **/
class CustomerDao {

    fun findCustomers() = ArrayList<Customer>().apply {
        add(Customer("張三", 23))
        add(Customer("李四", 30))
    }

}
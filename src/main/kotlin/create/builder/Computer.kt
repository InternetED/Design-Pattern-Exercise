package create.builder

/**
 *@date: 2019/9/7 : 下午 05:54
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class Person(
    val name: String
) {
    var age: Int = 0
        private set
    var countMemberOfFamily = 0
        private set
    var jobTitle: String = ""
        private set(value) {
            field = "工作： $value"
        }
        get() {
            println("顯示 $field")
            return field
        }


    fun addAge(age: Int): Person {
        this.age = age
        return this
    }


}
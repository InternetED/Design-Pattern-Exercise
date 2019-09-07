package create.singleton.kotlin

/**
 * Singleton patterns - Kotlin 版
 *
 *@date: 2019/5/22 : 上午 11:53
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
fun main() {

}


/**
 * 餓漢式(線程安全)
 *
 *
 * 類初始化時，自行實例化
 */
object Singleton01


/**
 * 懶漢式 (懶加載，適用於單線程環境)
 *
 *
 * 如果兩個線程同時運行到判斷 INSTANCE 是否為空，且 INSTANCE 尚未創建時，
 * 兩個線程都會創建一個實例，此時就不滿足單例模式的要求了。
 */
class Singleton02 private constructor() {


    companion object {
        private var INSTANCE: Singleton02? = null

        fun getInstance(): Singleton02 {
            return INSTANCE ?: Singleton02().apply { INSTANCE = this }
        }
    }
}


/**
 * 懶漢式 (懶加載，線程安全，適用於多線程環境，但效率不高)
 *
 *
 * 每次執行 getINSTANCE 方法時，都被 synchronized 關鍵字鎖住，會引起線程阻塞，影響程序效能
 */
class Singleton03 private constructor() {

    companion object {
        private var INSTANCE: Singleton03? = null

        @Synchronized
        fun getInstance(): Singleton03 {

            return INSTANCE ?: Singleton03().apply { INSTANCE = this }
        }
    }
}

/**
 * 雙重檢驗鎖(懶加載，線程安全)
 *
 *
 * 為了再多線程環境下，不影響程序效能，只有創建實例時，才做加鎖的動作。
 * p.s. 由於 JVM 底層內部模型原因，偶爾出現問題，不建議使用。
 */
class Singleton04 private constructor() {

    companion object {
        private var INSTANCE: Singleton04? = null

        fun getInstance(): Singleton04 {
            return INSTANCE ?: synchronized(Singleton04::class.java) {
                INSTANCE ?: Singleton04().apply { INSTANCE = this }
            }
        }
    }
}

/**
 * 靜態內部類 (線程安全，懶加載，不會被反射入侵)
 *
 * 加載類時，其內部類不會同時被加載，僅當其內部類某個靜態成員被調用時才會加載，
 * 當調用 StaticSingleton.INSTANCE 時，才會進行初始化，且通過反射不能通過外部類獲取內部類的屬性。
 */
class Singleton05 private constructor() {

    object StaticSingleton {
        val instance = Singleton05()
    }

    companion object {
        fun getInstance(): Singleton05 {
            return StaticSingleton.instance
        }
    }
}

/**
 * 枚舉方式(線程安全，沒有懶加載，防止反序列化及反射來創建新對象)
 *
 *
 */
enum class Singleton06 {
    INSTANCE

}


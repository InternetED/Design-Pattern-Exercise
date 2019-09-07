package create.singleton.java;

/**
 * Singleton patterns - Java 版
 *
 * @date: 2019/5/22 : 上午 11:04
 * @author: Ed
 * @email: salahayo3192@gmail.com
 **/
public class Java {
    public static void main(String[] args) {

    }
}

/**
 * 餓漢式(線程安全)
 * <p>
 * 類初始化時，自行實例化
 */
class Singleton01 {
    private static final Singleton01 instance = new Singleton01();

    private Singleton01() {
    }

    public Singleton01 getInstance() {
        return instance;
    }
}

/**
 * 懶漢式 (懶加載，適用於單線程環境)
 * <p>
 * 如果兩個線程同時運行到判斷 INSTANCE 是否為空，且 INSTANCE 尚未創建時，
 * 兩個線程都會創建一個實例，此時就不滿足單例模式的要求了。
 */
class Singleton02 {
    private static Singleton02 instance = null;

    private Singleton02() {
    }

    public Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}

/**
 * 懶漢式 (懶加載，線程安全，適用於多線程環境，但效率不高)
 * <p>
 * 每次執行 getINSTANCE 方法時，都被 synchronized 關鍵字鎖住，會引起線程阻塞，影響程序效能
 */
class Singleton03 {
    private static Singleton03 instance = null;

    private Singleton03() {
    }

    public synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}

/**
 * 雙重檢驗鎖(懶加載，線程安全)
 * <p>
 * 為了再多線程環境下，不影響程序效能，只有創建實例時，才做加鎖的動作。
 * p.s. 由於 JVM 底層內部模型原因，偶爾出現問題，不建議使用。
 */
class Singleton04 {
    private static Singleton04 instance = null;

    private Singleton04() {
    }

    public Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}

/**
 * 靜態內部類 (線程安全，懶加載，不會被反射入侵)
 *
 * 加載類時，其內部類不會同時被加載，僅當其內部類某個靜態成員被調用時才會加載，
 * 當調用 StaticSingleton.INSTANCE 時，才會進行初始化，且通過反射不能通過外部類獲取內部類的屬性。
 */
class Singleton05 {
    private Singleton05() {
    }

    private static class StaticSingleton {
        private static final Singleton05 instance = new Singleton05();
    }

    public Singleton05 getInstance() {
        return StaticSingleton.instance;
    }
}

/**
 * 枚舉方式(線程安全，沒有懶加載，防止反序列化及反射來創建新對象)
 *
 *
 * */
enum  Singleton06{
    INSTANCE;

}
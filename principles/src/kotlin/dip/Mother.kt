package kotlin.dip

/**
 *@date: 2019/1/6 : 下午 04:45
 *@author: Ed
 *@email: salahayo3192@gmail.com
 **/
class Mother {
    fun read(reader: IReader) {
        println("Mom is reading")
        reader.getContent()
    }
}
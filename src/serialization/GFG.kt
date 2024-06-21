package serialization

import java.io.*


internal class Dog : Serializable {
    var i: Int = 10

    @Transient
    val j: Int = 20
}

internal object GFG {
    @Throws(IOException::class, ClassNotFoundException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val d1 = Dog()

        println("serialization started")

        val fos = FileOutputStream("abc.ser")

        val oos = ObjectOutputStream(fos)

        oos.writeObject(d1)

        println("Serialization ended")
        println("Deserialization started")

        val fis = FileInputStream("abc.ser")
        val ois = ObjectInputStream(fis)
        val d2 = ois.readObject() as Dog

        println("Deserialization ended")
        println("Dog object data")

        println(d2.i.toString() + "\t" + d2.j)
    }
}
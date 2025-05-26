import kotlin.math.min

fun main() {

    var friends: Array<String> = arrayOf("dan", "kevi", "lwam", "hewi", "lwamy", "jerry")
    println(friends.contentToString())
    println(friends.get(3))
    friends[1] = "hani"
    println(friends.contentToString())
    friends[3] = "milly"
    println(friends.contentToString())
    friends.set(3, "milly")
    println(friends.contentToString())
    friends = friends.plus("meaza")
    println(friends.contentToString())
    friends = friends.plus(arrayOf("tom", "lul"))
    println(friends.contentToString())
    println(friends.indexOf("Lwam"))/* GIVE US NEGATIVE 1 B.SE WE DONT HAVE CAPITAL Lwam*/
    for (friend in friends) {
        println(friend)
        friends.forEach { friend -> println(friend) } /*same with for loop*/
        val sortedFriends=friends.sortedArray()
        println(sortedFriends.contentToString())

    }
    val fruit = "banana"
    println(fruit[2])
    val num = arrayOf(21, 34, 45, 56, 78, 90)
    println(num.sum())
    println(num.count())
    println(num.average())
    println(num.min())
    println(num.max())
    println(num.size)
    val sortedNum=num.sortedArray()
    println(sortedNum.contentToString())

    }

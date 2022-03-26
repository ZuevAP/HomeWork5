package ru.netology
val posts:MutableList<Post> = mutableListOf()

object WallService {

    fun add(post: Post): Post {

        post.Id = if (posts.isEmpty()) 1 else posts.last().Id + 1

        posts += post

        return posts.last()
    }

    fun print(post: Post) {

        println(posts.last().toString())

    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.Id == post.Id) {
                posts[index] = post.copy(Id = item.Id, date = item.date)
                return true
            }
        }
        return false
    }

}

fun main () {


    val service = WallService

    val myPost = Post(
        0,
        0,
        "Текст поста 1"
    )

    val myPost2 = Post(
        0,
        0,
        "Текст поста 2"
    )

    val myPost3 = Post(
        0,
        0,
        "Текст поста 3"

    )
    val myPost4 = Post(
        0,
        0,
        "Текст поста 4"
    )

    val myPost5 = Post(
        0,
        0,
        "Текст поста 5"

    )


    service.add(myPost)
    service.add(myPost2)
    service.add(myPost3)
    service.add(myPost4)
    service.add(myPost5)
    service.update(myPost4)
    service.print(myPost5)




}
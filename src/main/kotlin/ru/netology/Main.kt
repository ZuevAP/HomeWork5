package ru.netology
val posts:MutableList<Post> = mutableListOf()



fun main () {


    val service = WallService()

    val myPost = Post(
        0,
        1,
        null,
        null,
        null,
        "Текст поста 1",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )

    val myPost2 = Post(
        0,
        2,
        null,
        null,
        null,
        "Текст поста 2",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )

    val myPost3 = Post(
        0,
        3,
        null,
        null,
        null,
        "Текст поста 3",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null

    )
    val myPost4 = Post(
        0,
        4,
        null,
        null,
        null,
        "Текст поста 4",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )

    val myPost5 = Post(
        0,
        5,
        null,
        null,
        null,
        "Текст поста 5",
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null

    )


    service.add(myPost)
    service.add(myPost2)
    service.add(myPost3)
    service.add(myPost4)
    service.add(myPost5)
    service.update(myPost4)




}
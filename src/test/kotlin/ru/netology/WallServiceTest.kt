package ru.netology

import org.junit.Assert.*
import org.junit.Test

class WallServiceTest{


@Test
fun addFunction() {
    val service = WallService()
    val post = Post(
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
        null)

    service.add(post)

    var result: Boolean = posts.last().id > 0

    assertTrue(result)
}

@Test
fun updateExisting_True() {
    val service = WallService()

    service.add(Post(
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
        null))

    service.add(Post(
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
        null))

    service.add(Post(
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
        null))

    val update = Post(
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
        null)

    val result = service.update(update)

    assertFalse(result)
}

@Test
fun updateExisting_False() {
    val service = WallService()
    service.add(Post(
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
        null))

    service.add(Post(
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
        null))

        val update = Post(
            2,
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
            null)

    val result = service.update(update)

    assertFalse(result)

}
}
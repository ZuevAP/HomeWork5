package ru.netology

class WallService {

    fun add(post: Post): Post {


        posts += post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)


        return posts.last()
    }


    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post.copy(ownerId = item.ownerId, date = item.date)
                return true
            }
        }
        return false
    }

}
package ru.netology

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int? = null,
    val createdById: Int? = null,
    val date: Int? = null,
    val text: String,
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean? = null,
    val comments: Comments? = null,
    val copyright: String? = null,
    val likes: Likes? = null,
    val reports: Reports? = null,
    val views: Views? = null,
    val postType: String? = null,
    var signerId: Int? = null,
    val canPin: Boolean? = null,
    val canDelete: Boolean? = null,
    val canEdit: Boolean? = null,
    val isPinned: Boolean? = null,
    val markedAsAds: Boolean? = null,
    val isFavorite: Boolean? = null,
    val postponedId: Int? = null,

    ) {

    override fun toString(): String {
        return "ID:$id \n$text "
    }


}

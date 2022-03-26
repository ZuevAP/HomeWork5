package ru.netology

data class Post(
    var Id: Int,
//    var ownerId: Int,
//    var fromId: Int,
//    var createdById: Int,
    var date: Int,
    val text: String,
//    var replyOwnerId: Int,
//    var replyPostId: Int,
//    val friendsOnly: Boolean ,
//    val comments: Comments,
//    val copyright: String,
//    val likes: Likes,
//    val reports: Reports,
//    val views: Views,
//    val postType: String,
//    var signerId: Int,
//    val canPin: Boolean,
//    val canDelete: Boolean,
//    val canEdit: Boolean,
//    val isPinned: Boolean,
//    val markedAsAds: Boolean,
//    val isFavorite: Boolean,
//    var postponedId: Int,

) {


    override fun toString(): String {
        return "ID:$Id \n$text "
    }


}

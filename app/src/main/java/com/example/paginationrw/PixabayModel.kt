package com.example.paginationrw

data class PixabayModel(
    var hits: ArrayList<ImageModel>
)

data class ImageModel(
    var largeImageUrl: String,
    var likes: Int
)
package com.example.youtube.data.model

import com.google.gson.annotations.SerializedName

data class PlaylistItemModel(
    @SerializedName("tag")
    val tag: String,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("nextPageToken")
    val nextPageToken: String,
    @SerializedName("pageInfo")
    val pageInfo: PageInfo
) {
    data class Item(
        @SerializedName("contentDetails")
        val contentDetails: ContentDetails,
        @SerializedName("tag")
        val eTag: String,
        @SerializedName("id")
        val id: String,
        @SerializedName("kind")
        val kind: String,
        @SerializedName("snippet")
        val snippet: Snippet
    ) {
        data class ContentDetails(
            @SerializedName("videoId")
            val videoId: String,
            @SerializedName("videoPublishedAt")
            val videoPublishedAt: String
        )

        data class Snippet(
            @SerializedName("channelId")
            val channelId: String,
            @SerializedName("channelTitle")
            val channelTitle: String,
            @SerializedName("description")
            val description: String,
            @SerializedName("playlistId")
            val playlistId: String,
            @SerializedName("position")
            val position: Int,
            @SerializedName("publishedAt")
            val publishedAt: String,
            @SerializedName("resourceId")
            val resourceId: ResourceId,
            @SerializedName("thumbnails")
            val thumbnails: Thumbnails,
            @SerializedName("title")
            val title: String,
            @SerializedName("videoOwnerChannelId")
            val videoOwnerChannelId: String,
            @SerializedName("videoOwnerChannelTitle")
            val videoOwnerChannelTitle: String
        ) {
            data class ResourceId(
                @SerializedName("kind")
                val kind: String,
                @SerializedName("videoId")
                val videoId: String
            )

            data class Thumbnails(
                @SerializedName("default")
                val default: Default,
                @SerializedName("high")
                val high: High,
                @SerializedName("maxres")
                val maxRes: Maxres,
                @SerializedName("medium")
                val medium: Medium,
                @SerializedName("standard")
                val standard: Standard
            ) {


                data class High(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )
                data class Standard(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )
                data class Default(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )
                data class Maxres(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )
                data class Medium(
                    @SerializedName("height")
                    val height: Int,
                    @SerializedName("url")
                    val url: String,
                    @SerializedName("width")
                    val width: Int
                )
            }
        }
    }
    data class PageInfo(
        @SerializedName("resultsPerPage")
        val resultsPerPage: Int,
        @SerializedName("totalResults")
        val totalResults: Int
    )
}
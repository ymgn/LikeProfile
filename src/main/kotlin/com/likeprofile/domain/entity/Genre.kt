package com.likeprofile.domain.entity

class Genre(val name: String,val kana: String, private var parentGenre: Genre? = null)

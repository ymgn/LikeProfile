package com.likeprofile.infrastructure

import com.likeprofile.domain.entity.Genre

class LikeOnMemoryRepository
{
    private var data: Array<Genre?> = arrayOfNulls(100);

    fun findAll(): Array<Genre?> {
        return  this.data;
    }
}

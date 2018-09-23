package com.likeprofile.infrastructure

import com.likeprofile.domain.entity.Genre

class GenreOnMemoryRepository
{
//    private var data: Array<Genre?> = arrayOfNulls(100)
    private var datas: ArrayList<Genre?> = arrayListOf()

    fun saveInArrayList(data: ArrayList<Genre>) {
        data.forEach {
            this.datas.add(it)
        }
    }

    fun findAll(): ArrayList<Genre?> {
        return  this.datas
    }
}

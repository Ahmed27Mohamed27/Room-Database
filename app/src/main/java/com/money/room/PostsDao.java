package com.money.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface PostsDao {
    @Insert
    Completable insertPost(Post post);
    @Query("select * from posts_table")
    Single<List<Post>> getPost();
}

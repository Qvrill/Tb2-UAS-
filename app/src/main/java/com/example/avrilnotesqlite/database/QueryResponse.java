package com.example.avrilnotesqlite.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}
package com.example.designpatternsmvvm

interface BindableAdapter<T> {
    fun setItems(data: T?)
}
package com.example.basekotlin.mvi_simple_approach.mvi_on_mvvm

sealed class State<D> {
    class LoadingState<D> : State<D>()
    class ErrorState<D>(error: Throwable) : State<D>()
    class SuccessState<D>(data: D) : State<D>()
    class EmptyDataState<D>() : State<D>()
}
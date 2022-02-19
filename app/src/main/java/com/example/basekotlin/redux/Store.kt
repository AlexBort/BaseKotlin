package com.example.basekotlin.redux

/**
 * state container for a given screen
 */
class Store<S : State, A : Action>(initialState: State, reducer: Reducer<S, A>) {

}
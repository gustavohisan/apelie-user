package com.gustavohisan.apelieuser.repository.model.store

/**
 * Representation of the store state.
 */
sealed class MainScreenStoreState {

    /**
     * Represents the store state when the list of stores was successfully retrieved.
     *
     * @param storeList the [List] of [MainScreenStore]s
     */
    data class Success(val storeList: List<MainScreenStore>?) : MainScreenStoreState()

    /**
     * Represents the store state when there was an server error retrieving the store list.
     */
    object Error : MainScreenStoreState()
}

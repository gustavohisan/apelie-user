package com.gustavohisan.apelieuser.main.navigation

import androidx.navigation.NavHostController
import com.gustavohisan.apelieuser.navigation.Destinations

internal data class HomeNavActions(val navController: NavHostController) {

    val onSectionClicked: (String) -> Unit = { sectionRoute ->
        navController.navigate(sectionRoute)
    }

    val onStoreClicked: (Int) -> Unit = { storeId ->
        navController.navigate("${Destinations.STORE_ROUTE}/$storeId")
    }
}

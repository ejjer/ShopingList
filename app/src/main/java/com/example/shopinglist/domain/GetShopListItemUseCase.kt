package com.example.shopinglist.domain

class GetShopListItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopListItemUseCase(shopItemId: Int): ShopItem {
        return shopListRepository.getShopListItem(shopItemId)
    }
}
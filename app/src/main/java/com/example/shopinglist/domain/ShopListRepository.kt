package com.example.shopinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopListItem(shopItemId: Int): ShopItem
    fun getShopList():List<ShopItem>

}
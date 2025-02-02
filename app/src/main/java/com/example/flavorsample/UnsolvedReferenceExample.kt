package com.example.flavorsample

@Suppress("unused")
fun unsolvedReferenceExample() {
    // 調用 free 中的 FreeUser
    // 切換至其他 flavor 時會報錯 Unresolved reference: FreeUser
//    FreeUser("username")
}
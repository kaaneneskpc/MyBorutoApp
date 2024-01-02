package com.example.borutoapp.utils.extensions

/**
 * It allows to check whether the two list values are the same or not, regardless of the order.
 */
fun <T> List<T>.isEqualsIgnoreOrder(other: List<T>) = this.size == other.size && this.toSet() == other.toSet()

/**
 * @param index istenilen değer
 * @param orDefault veri bulunamazsa dönecek değer
 * nullsafe kullanım için geliştirilmiştir
 * list string listesi olmak üzere list.getOrNull(2) bu şekilde veya list.getOrNull(2,"veriyok") bu şekilde kullanılabilir
 */
fun <T> List<T>.getOrNull(index: Int, orDefault: T? = null): T? {
    return if (index in 0..lastIndex) get(index) else orDefault
}
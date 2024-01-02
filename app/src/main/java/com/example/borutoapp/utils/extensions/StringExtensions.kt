package com.example.borutoapp.utils.extensions

/**
 * Returns a given text's position in String
 *
 * Pair<start, end>
 */
fun String.getTextPosition(text: String): Pair<Int, Int> {
    return Pair(
        this.indexOf(text),
        this.indexOf(text) + text.length
    )
}

/**
 * allFirstLettersAreUppercase() extensions ile kaç kelime olursa olsun her kelimenin ilk harfi büyük olacak.
 */
fun String.allFirstLettersAreUppercase(): String {
    return split(" ").joinToString(" ") { it.replaceFirstChar(Char::titlecase) }
}

/**
 * @param first: İlk karakterden sonraki boşluğu kaldır.
 * bu işlem boşluk bitene kadar devam eder.
 */
fun String.removeSpacesBetweenChars(first: Char): String {
    val regex = Regex("$first\\s+")
    return this.replace(regex, first.toString())
}
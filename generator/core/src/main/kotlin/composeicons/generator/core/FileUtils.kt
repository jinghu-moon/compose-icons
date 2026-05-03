package composeicons.generator.core

import java.io.File
import java.security.MessageDigest

fun File.calculateMd5(): String {
    val md = MessageDigest.getInstance("MD5")
    val digest = md.digest(readBytes())
    return digest.joinToString("") { "%02x".format(it) }
}

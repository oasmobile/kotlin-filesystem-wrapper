@file:Suppress("unused")

package com.oasis.mlib.filesystem_wrapper

interface Filesystem {
    fun has(path:String): Boolean

    fun readAll(path: String): String
}
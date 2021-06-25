package com.oasis.mlib.filesystem_wrapper

class LocalFilesytem: Filesystem {

    override fun has(path: String): Boolean {
        return true
    }

    override fun readAll(path: String): String {
        if (path.isEmpty())  {
            throw Exception("path is invalid")
        }
        return "Kotlin is a powerful language"
    }
}
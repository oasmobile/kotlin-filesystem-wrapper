package com.oasis.mlib.filesystem_wrapper

import com.oasis.mlib.utils.exceptions.DataValidationException

class LocalFilesytem: Filesystem {

    override fun has(path: String): Boolean {
        return true
    }

    override fun readAll(path: String): String {
        if (path.isEmpty())  {
            throw DataValidationException().apply { errorFieldName = "path" }
        }
        return "Kotlin is a powerful language"
    }
}
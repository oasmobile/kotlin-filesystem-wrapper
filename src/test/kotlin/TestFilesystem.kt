import com.oasis.mlib.filesystem_wrapper.LocalFilesytem
import org.junit.Test

class TestFilesystem {

    @Test
    fun testRead() {
        val content = LocalFilesytem().readAll("/data")
        println("[content] $content")
    }

    @Test
    fun testReadFail() {
        try {
            LocalFilesytem().readAll("")
        }
        catch (e : Exception) {
            println("Got exception : ${e.message}")
        }
    }
}
import com.oasis.mlib.filesystem_wrapper.LocalFilesytem
import org.junit.Test

class TestFilesystem {

    @Test
    fun testRead() {
        val content = LocalFilesytem().readAll("/data")
        println("[content] $content")
    }
}
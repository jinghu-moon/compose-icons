package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileStar: ImageVector
    get() {
        if (_fileStar != null) return _fileStar!!
        _fileStar = tablerFilledIcon(
            name = "FileStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM11.8 11c-.149-.001-.285 .084-.351 .217l-1.086 2.193-2.428 .352c-.147 .02-.27 .123-.316 .265-.046 .141-.008 .297 .099 .4l1.757 1.707-.415 2.411c-.024 .146 .037 .293 .158 .38 .12 .087 .279 .098 .41 .03l2.172-1.138 2.172 1.138c.131 .07 .291 .059 .412-.029 .12-.087 .181-.236 .155-.382l-.414-2.41 1.757-1.707c.106-.104 .144-.259 .098-.4-.046-.141-.168-.244-.315-.265l-2.428-.352L12.151 11.217c-.066-.133-.202-.218-.351-.217")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileStar!!
    }

private var _fileStar: ImageVector? = null

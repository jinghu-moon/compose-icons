package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDigit: ImageVector
    get() {
        if (_fileDigit != null) return _fileDigit!!
        _fileDigit = tablerFilledIcon(
            name = "FileDigit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM11 11h-1c-1.105 0-2 .895-2 2v3c0 1.105 .895 2 2 2h1c1.105 0 2-.895 2-2v-3c0-1.105-.895-2-2-2M15 11c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-5c0-.552-.448-1-1-1M11 13v3h-1v-3Z")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileDigit!!
    }

private var _fileDigit: ImageVector? = null

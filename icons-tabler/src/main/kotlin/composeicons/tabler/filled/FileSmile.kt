package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileSmile: ImageVector
    get() {
        if (_fileSmile != null) return _fileSmile!!
        _fileSmile = tablerFilledIcon(
            name = "FileSmile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM14.82 16.429c-.315-.453-.938-.565-1.391-.25-.859 .598-1.999 .598-2.858 0-.453-.315-1.077-.203-1.392 .25-.315 .453-.203 1.077 .25 1.392 1.545 1.076 3.597 1.076 5.142 0 .218-.151 .366-.383 .413-.644 .047-.261-.012-.53-.163-.748M10.006 12h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14.006 12h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileSmile!!
    }

private var _fileSmile: ImageVector? = null

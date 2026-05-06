package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDollar: ImageVector
    get() {
        if (_fileDollar != null) return _fileDollar!!
        _fileDollar = tablerFilledIcon(
            name = "FileDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM12 10c-.552 0-1 .448-1 1v.05c-1.259 .256-2.119 1.423-1.99 2.701 .129 1.278 1.205 2.25 2.49 2.249h1c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-2.5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.05c1.259-.256 2.119-1.423 1.99-2.701C14.861 14.971 13.784 13.999 12.5 14h-1C11.224 14 11 13.776 11 13.5c0-.276 .224-.5 .5-.5h2.5c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-1c0-.552-.448-1-1-1")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileDollar!!
    }

private var _fileDollar: ImageVector? = null

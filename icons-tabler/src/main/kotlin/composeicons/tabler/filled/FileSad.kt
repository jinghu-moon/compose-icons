package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileSad: ImageVector
    get() {
        if (_fileSad != null) return _fileSad!!
        _fileSad = tablerFilledIcon(
            name = "FileSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM14.571 17.18c-1.545-1.076-3.597-1.076-5.142 0-.309 .197-.485 .548-.459 .914 .026 .366 .25 .688 .584 .839 .334 .151 .724 .108 1.016-.113 .859-.598 1.999-.598 2.858 0 .452 .289 1.052 .17 1.359-.271 .307-.441 .211-1.045-.217-1.369M10.006 12h-.011c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14.005 12h-.011c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileSad!!
    }

private var _fileSad: ImageVector? = null

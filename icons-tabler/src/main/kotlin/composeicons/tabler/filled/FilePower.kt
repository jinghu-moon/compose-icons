package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FilePower: ImageVector
    get() {
        if (_filePower != null) return _filePower!!
        _filePower = tablerFilledIcon(
            name = "FilePower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM12.555 11.168c-.221-.147-.491-.201-.751-.149-.26 .052-.489 .205-.636 .426l-2 3-.057 .097c-.16 .31-.146 .681 .035 .979 .182 .298 .505 .479 .854 .479h2.13l-.962 1.445c-.307 .46-.183 1.08 .277 1.387 .46 .307 1.08 .183 1.387-.277l2-3 .057-.097c.16-.31 .146-.681-.035-.979C14.672 14.182 14.349 14 14 14h-2.132l.964-1.445c.147-.221 .201-.491 .149-.751-.052-.26-.205-.489-.426-.636")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _filePower!!
    }

private var _filePower: ImageVector? = null

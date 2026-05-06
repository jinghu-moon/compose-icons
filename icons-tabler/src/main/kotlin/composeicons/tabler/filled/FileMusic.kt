package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) return _fileMusic!!
        _fileMusic = tablerFilledIcon(
            name = "FileMusic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM12.447 11.106c-.31-.155-.678-.138-.973 .044-.295 .182-.474 .504-.474 .85v3c-1.047-0-1.917 .806-1.995 1.85L9 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-3.382l.553 .276c.49 .227 1.072 .023 1.314-.461 .242-.483 .056-1.071-.42-1.327Z")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null

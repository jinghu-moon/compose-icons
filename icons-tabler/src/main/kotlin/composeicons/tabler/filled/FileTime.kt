package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileTime: ImageVector
    get() {
        if (_fileTime != null) return _fileTime!!
        _fileTime = tablerFilledIcon(
            name = "FileTime",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM12 10c-2.677 0-4.879 2.109-4.995 4.783L7 15c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0-2.761-2.239-5-5-5M12 12c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C10.343 18 9 16.657 9 15c0-1.657 1.343-3 3-3M12 12.496c-.552 0-1 .448-1 1v1.504c0 .265 .105 .52 .293 .707l1 1c.391 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L13 14.585v-1.089c0-.552-.448-1-1-1")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileTime!!
    }

private var _fileTime: ImageVector? = null

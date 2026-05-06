package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = tablerFilledIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2h5ZM10.511 11.14c-.413-.246-.943-.163-1.261 .197-.318 .36-.335 .896-.04 1.276l.083 .094L10.585 14 9.293 15.293l-.083 .094c-.309 .398-.273 .964 .083 1.32 .356 .356 .922 .392 1.32 .083l.094-.083L12 15.415l1.293 1.292 .094 .083c.398 .309 .964 .273 1.32-.083 .356-.356 .392-.922 .083-1.32l-.083-.094L13.415 14l1.292-1.293 .083-.094c.309-.398 .273-.964-.083-1.32-.356-.356-.922-.392-1.32-.083l-.094 .083L12 12.585 10.707 11.293l-.094-.083-.102-.07Z")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileX!!
    }

private var _fileX: ImageVector? = null

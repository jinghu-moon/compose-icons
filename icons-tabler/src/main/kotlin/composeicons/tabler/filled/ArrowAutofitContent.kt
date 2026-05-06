package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitContent: ImageVector
    get() {
        if (_arrowAutofitContent != null) return _arrowAutofitContent!!
        _arrowAutofitContent = tablerFilledIcon(
            name = "ArrowAutofitContent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.707 3.293c.356 .356 .392 .922 .083 1.32l-.083 .094L5.415 6h4.585c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L10 8h-4.585L6.707 9.293c.356 .356 .392 .922 .083 1.32l-.083 .094c-.356 .356-.922 .392-1.32 .083l-.094-.083-3-3C2.258 7.672 2.226 7.635 2.196 7.595L2.125 7.485 2.071 7.371 2.036 7.266 2.011 7.148 2.004 7.09 2 7l.003-.075 .017-.126 .03-.111 .044-.111 .052-.098 .064-.092 .083-.094L5.293 3.293c.39-.39 1.023-.39 1.414 0Z")
            addPathData("M18.613 3.21l.094 .083 3 3c.035 .035 .068 .072 .097 .112l.071 .11 .054 .114 .035 .105 .03 .148L22 7l-.003 .075-.017 .126-.03 .111-.044 .111-.052 .098-.074 .104-.073 .082-3 3c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L18.585 8h-4.585c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L14 6h4.585L17.293 4.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.356-.356 .922-.392 1.32-.083Z")
            addPathData("M18 13h-12C4.343 13 3 14.343 3 16v2c0 1.657 1.343 3 3 3h12c1.657 0 3-1.343 3-3v-2c0-1.657-1.343-3-3-3Z")
        }
        return _arrowAutofitContent!!
    }

private var _arrowAutofitContent: ImageVector? = null

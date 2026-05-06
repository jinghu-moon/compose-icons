package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilesOff: ImageVector
    get() {
        if (_filesOff != null) return _filesOff!!
        _filesOff = tablerOutlineIcon(
            name = "FilesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 17h-6C9.895 17 9 16.105 9 15v-6M9 5C9 3.895 9.895 3 11 3h4l5 5v7c0 .294-.063 .572-.177 .823")
            addPathData("M16 17v2c0 1.105-.895 2-2 2h-7C5.895 21 5 20.105 5 19v-10C5 7.895 5.895 7 7 7")
            addPathData("M3 3 21 21")
        }
        return _filesOff!!
    }

private var _filesOff: ImageVector? = null

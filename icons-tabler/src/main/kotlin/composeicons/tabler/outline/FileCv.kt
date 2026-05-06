package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileCv: ImageVector
    get() {
        if (_fileCv != null) return _fileCv!!
        _fileCv = tablerOutlineIcon(
            name = "FileCv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M11 12.5C11 11.672 10.328 11 9.5 11 8.672 11 8 11.672 8 12.5v3C8 16.328 8.672 17 9.5 17 10.328 17 11 16.328 11 15.5")
            addPathData("M13 11l1.5 6L16 11")
        }
        return _fileCv!!
    }

private var _fileCv: ImageVector? = null

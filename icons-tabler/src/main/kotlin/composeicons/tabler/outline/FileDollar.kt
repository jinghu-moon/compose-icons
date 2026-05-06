package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileDollar: ImageVector
    get() {
        if (_fileDollar != null) return _fileDollar!!
        _fileDollar = tablerOutlineIcon(
            name = "FileDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M14 11h-2.5C10.672 11 10 11.672 10 12.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C14 16.328 13.328 17 12.5 17h-2.5")
            addPathData("M12 17v1M12 10v1")
        }
        return _fileDollar!!
    }

private var _fileDollar: ImageVector? = null

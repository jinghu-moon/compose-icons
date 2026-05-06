package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileSmile: ImageVector
    get() {
        if (_fileSmile != null) return _fileSmile!!
        _fileSmile = tablerOutlineIcon(
            name = "FileSmile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2M10 14h.01M14 14h.01")
            addPathData("M10 17c1.202 .837 2.798 .837 4 0")
        }
        return _fileSmile!!
    }

private var _fileSmile: ImageVector? = null

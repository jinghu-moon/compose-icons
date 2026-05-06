package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.File3D: ImageVector
    get() {
        if (_file3D != null) return _file3D!!
        _file3D = tablerOutlineIcon(
            name = "File3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M12 13.5 16 12")
            addPathData("M8 11.846l4 1.654v4.5l4-1.846v-4.308L12 10 8 11.846")
            addPathData("M8 12v4.2L12 18")
        }
        return _file3D!!
    }

private var _file3D: ImageVector? = null

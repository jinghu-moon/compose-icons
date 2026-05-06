package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = tablerOutlineIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C13 13.239 10.761 11 8 11 5.239 11 3 13.239 3 16")
            addPathData("M17 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19 17c0-1.657-1.343-3-3-3h-3.4")
            addPathData("M3 3h1c1.105 0 2 .895 2 2v6")
            addPathData("M6 8h11")
            addPathData("M15 8v6")
        }
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Favicon: ImageVector
    get() {
        if (_favicon != null) return _favicon!!
        _favicon = tablerOutlineIcon(
            name = "Favicon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8C2 6.343 3.343 5 5 5h14c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-14C3.343 19 2 17.657 2 16v-8")
            addPathData("M6 10v4")
            addPathData("M11 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2")
            addPathData("M14 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _favicon!!
    }

private var _favicon: ImageVector? = null

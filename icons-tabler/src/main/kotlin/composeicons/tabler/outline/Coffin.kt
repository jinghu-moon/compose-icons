package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Coffin: ImageVector
    get() {
        if (_coffin != null) return _coffin!!
        _coffin = tablerOutlineIcon(
            name = "Coffin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3 5 9 7 21h6L15 9 13 3h-6")
            addPathData("M10 7v5")
            addPathData("M8 9h4")
            addPathData("M13 21h4L19 9 17 3h-4")
        }
        return _coffin!!
    }

private var _coffin: ImageVector? = null

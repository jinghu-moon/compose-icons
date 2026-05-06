package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GridGoldenratio: ImageVector
    get() {
        if (_gridGoldenratio != null) return _gridGoldenratio!!
        _gridGoldenratio = tablerOutlineIcon(
            name = "GridGoldenratio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10h18")
            addPathData("M3 14h18")
            addPathData("M10 3v18")
            addPathData("M14 3v18")
        }
        return _gridGoldenratio!!
    }

private var _gridGoldenratio: ImageVector? = null

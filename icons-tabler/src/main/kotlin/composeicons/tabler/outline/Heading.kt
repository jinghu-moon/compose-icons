package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Heading: ImageVector
    get() {
        if (_heading != null) return _heading!!
        _heading = tablerOutlineIcon(
            name = "Heading",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12h10")
            addPathData("M7 5v14")
            addPathData("M17 5v14")
            addPathData("M15 19h4")
            addPathData("M15 5h4")
            addPathData("M5 19h4")
            addPathData("M5 5h4")
        }
        return _heading!!
    }

private var _heading: ImageVector? = null

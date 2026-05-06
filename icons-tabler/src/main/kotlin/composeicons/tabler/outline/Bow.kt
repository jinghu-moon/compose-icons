package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bow: ImageVector
    get() {
        if (_bow != null) return _bow!!
        _bow = tablerOutlineIcon(
            name = "Bow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3h4v4")
            addPathData("M21 3 6 18")
            addPathData("M3 18h3v3")
            addPathData("M16.5 20C18.076 18.424 19 15.905 19 13.5 19 8.69 15.31 5 10.5 5 8.085 5 5.578 5.913 4 7.5L16.5 20")
        }
        return _bow!!
    }

private var _bow: ImageVector? = null

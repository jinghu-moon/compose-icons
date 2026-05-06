package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = tablerOutlineIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 4h-18")
            addPathData("M13 16h-6")
            addPathData("M11 20h4")
            addPathData("M6 8h14")
            addPathData("M4 12h12")
        }
        return _tornado!!
    }

private var _tornado: ImageVector? = null

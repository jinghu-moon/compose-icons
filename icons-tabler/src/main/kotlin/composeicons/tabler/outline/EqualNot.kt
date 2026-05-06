package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EqualNot: ImageVector
    get() {
        if (_equalNot != null) return _equalNot!!
        _equalNot = tablerOutlineIcon(
            name = "EqualNot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 10h14")
            addPathData("M5 14h14")
            addPathData("M5 19 19 5")
        }
        return _equalNot!!
    }

private var _equalNot: ImageVector? = null

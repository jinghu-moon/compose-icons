package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pennant: ImageVector
    get() {
        if (_pennant != null) return _pennant!!
        _pennant = tablerOutlineIcon(
            name = "Pennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h4")
            addPathData("M10 21v-18")
            addPathData("M10 4l9 4-9 4")
        }
        return _pennant!!
    }

private var _pennant: ImageVector? = null

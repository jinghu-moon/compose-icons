package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Selector: ImageVector
    get() {
        if (_selector != null) return _selector!!
        _selector = tablerOutlineIcon(
            name = "Selector",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9 12 5l4 4")
            addPathData("M16 15l-4 4L8 15")
        }
        return _selector!!
    }

private var _selector: ImageVector? = null

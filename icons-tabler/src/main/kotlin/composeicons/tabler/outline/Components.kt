package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Components: ImageVector
    get() {
        if (_components != null) return _components!!
        _components = tablerOutlineIcon(
            name = "Components",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12l3 3L9 12 6 9 3 12")
            addPathData("M15 12l3 3 3-3L18 9l-3 3")
            addPathData("M9 6l3 3L15 6 12 3 9 6")
            addPathData("M9 18l3 3 3-3L12 15 9 18")
        }
        return _components!!
    }

private var _components: ImageVector? = null

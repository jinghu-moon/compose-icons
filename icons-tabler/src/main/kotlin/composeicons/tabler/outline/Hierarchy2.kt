package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hierarchy2: ImageVector
    get() {
        if (_hierarchy2 != null) return _hierarchy2!!
        _hierarchy2 = tablerOutlineIcon(
            name = "Hierarchy2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3h4v4h-4v-4")
            addPathData("M3 17h4v4h-4v-4")
            addPathData("M17 17h4v4h-4v-4")
            addPathData("M7 17l5-4 5 4")
            addPathData("M12 7v6")
        }
        return _hierarchy2!!
    }

private var _hierarchy2: ImageVector? = null

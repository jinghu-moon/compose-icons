package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = tablerOutlineIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h-2L3 14")
            addPathData("M16 4h2l3 10")
            addPathData("M10 16h4")
            addPathData("M21 16.5C21 18.433 19.433 20 17.5 20 15.567 20 14 18.433 14 16.5v-2.5h7v2.5")
            addPathData("M10 16.5C10 18.433 8.433 20 6.5 20 4.567 20 3 18.433 3 16.5v-2.5h7v2.5")
            addPathData("M4 14l4.5 4.5")
            addPathData("M15 14l4.5 4.5")
        }
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null

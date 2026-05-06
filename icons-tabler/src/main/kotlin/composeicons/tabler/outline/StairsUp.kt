package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StairsUp: ImageVector
    get() {
        if (_stairsUp != null) return _stairsUp!!
        _stairsUp = tablerOutlineIcon(
            name = "StairsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 6h-5v5h-5v5h-5v5h-5")
            addPathData("M6 10v-7")
            addPathData("M3 6 6 3 9 6")
        }
        return _stairsUp!!
    }

private var _stairsUp: ImageVector? = null

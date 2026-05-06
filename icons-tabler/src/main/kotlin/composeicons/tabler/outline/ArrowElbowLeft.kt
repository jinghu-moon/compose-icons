package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = tablerOutlineIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 14v-6h6")
            addPathData("M3 8l9 9L21 8")
        }
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = tablerOutlineIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 14v-6h-6")
            addPathData("M21 8l-9 9L3 8")
        }
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowBottomLeft: ImageVector
    get() {
        if (_innerShadowBottomLeft != null) return _innerShadowBottomLeft!!
        _innerShadowBottomLeft = tablerOutlineIcon(
            name = "InnerShadowBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M6 12c0 3.314 2.686 6 6 6")
        }
        return _innerShadowBottomLeft!!
    }

private var _innerShadowBottomLeft: ImageVector? = null

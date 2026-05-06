package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowTopLeft: ImageVector
    get() {
        if (_innerShadowTopLeft != null) return _innerShadowTopLeft!!
        _innerShadowTopLeft = tablerOutlineIcon(
            name = "InnerShadowTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3")
            addPathData("M6 12C6 8.686 8.686 6 12 6")
        }
        return _innerShadowTopLeft!!
    }

private var _innerShadowTopLeft: ImageVector? = null

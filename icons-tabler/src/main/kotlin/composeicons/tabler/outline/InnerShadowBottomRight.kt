package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowBottomRight: ImageVector
    get() {
        if (_innerShadowBottomRight != null) return _innerShadowBottomRight!!
        _innerShadowBottomRight = tablerOutlineIcon(
            name = "InnerShadowBottomRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M18 12c0 3.314-2.686 6-6 6")
        }
        return _innerShadowBottomRight!!
    }

private var _innerShadowBottomRight: ImageVector? = null

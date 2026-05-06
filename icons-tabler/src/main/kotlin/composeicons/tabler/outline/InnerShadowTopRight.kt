package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowTopRight: ImageVector
    get() {
        if (_innerShadowTopRight != null) return _innerShadowTopRight!!
        _innerShadowTopRight = tablerOutlineIcon(
            name = "InnerShadowTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3C7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3")
            addPathData("M18 12C18 8.686 15.314 6 12 6")
        }
        return _innerShadowTopRight!!
    }

private var _innerShadowTopRight: ImageVector? = null

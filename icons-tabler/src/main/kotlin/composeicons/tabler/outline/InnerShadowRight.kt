package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowRight: ImageVector
    get() {
        if (_innerShadowRight != null) return _innerShadowRight!!
        _innerShadowRight = tablerOutlineIcon(
            name = "InnerShadowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.364 18.364c-3.515 3.515-9.213 3.515-12.728 0C2.121 14.849 2.121 9.151 5.636 5.636c3.515-3.515 9.213-3.515 12.728 0 3.515 3.515 3.515 9.213 0 12.728")
            addPathData("M16.243 7.757c1.125 1.125 1.758 2.652 1.758 4.243 0 1.591-.632 3.118-1.758 4.243")
        }
        return _innerShadowRight!!
    }

private var _innerShadowRight: ImageVector? = null

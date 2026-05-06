package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowBottom: ImageVector
    get() {
        if (_innerShadowBottom != null) return _innerShadowBottom!!
        _innerShadowBottom = tablerOutlineIcon(
            name = "InnerShadowBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.364 18.364c3.515-3.515 3.515-9.213 0-12.728C14.849 2.121 9.151 2.121 5.636 5.636c-3.515 3.515-3.515 9.213 0 12.728 3.515 3.515 9.213 3.515 12.728 0")
            addPathData("M7.757 16.243c1.125 1.125 2.652 1.758 4.243 1.758 1.591 0 3.118-.632 4.243-1.758")
        }
        return _innerShadowBottom!!
    }

private var _innerShadowBottom: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowLeft: ImageVector
    get() {
        if (_innerShadowLeft != null) return _innerShadowLeft!!
        _innerShadowLeft = tablerOutlineIcon(
            name = "InnerShadowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.636 5.636C9.151 2.121 14.849 2.121 18.364 5.636c3.515 3.515 3.515 9.213 0 12.728-3.515 3.515-9.213 3.515-12.728 0C2.121 14.849 2.121 9.151 5.636 5.636")
            addPathData("M7.757 16.243C6.632 15.118 5.999 13.591 5.999 12c0-1.591 .632-3.118 1.758-4.243")
        }
        return _innerShadowLeft!!
    }

private var _innerShadowLeft: ImageVector? = null

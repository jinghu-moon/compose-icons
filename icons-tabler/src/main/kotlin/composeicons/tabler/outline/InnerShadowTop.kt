package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowTop: ImageVector
    get() {
        if (_innerShadowTop != null) return _innerShadowTop!!
        _innerShadowTop = tablerOutlineIcon(
            name = "InnerShadowTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.636 5.636C2.121 9.151 2.121 14.849 5.636 18.364c3.515 3.515 9.213 3.515 12.728 0 3.515-3.515 3.515-9.213 0-12.728C14.849 2.121 9.151 2.121 5.636 5.636")
            addPathData("M16.243 7.757C15.118 6.632 13.591 5.999 12 5.999c-1.591 0-3.118 .632-4.243 1.758")
        }
        return _innerShadowTop!!
    }

private var _innerShadowTop: ImageVector? = null

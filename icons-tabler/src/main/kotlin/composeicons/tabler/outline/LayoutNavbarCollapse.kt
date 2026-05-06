package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutNavbarCollapse: ImageVector
    get() {
        if (_layoutNavbarCollapse != null) return _layoutNavbarCollapse!!
        _layoutNavbarCollapse = tablerOutlineIcon(
            name = "LayoutNavbarCollapse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v-12C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18")
            addPathData("M4 9h16")
            addPathData("M10 16l2-2 2 2")
        }
        return _layoutNavbarCollapse!!
    }

private var _layoutNavbarCollapse: ImageVector? = null

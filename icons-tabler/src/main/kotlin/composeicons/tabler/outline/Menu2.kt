package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Menu2: ImageVector
    get() {
        if (_menu2 != null) return _menu2!!
        _menu2 = tablerOutlineIcon(
            name = "Menu2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M4 12h16")
            addPathData("M4 18h16")
        }
        return _menu2!!
    }

private var _menu2: ImageVector? = null

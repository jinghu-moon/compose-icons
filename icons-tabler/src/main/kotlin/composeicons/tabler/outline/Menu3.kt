package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Menu3: ImageVector
    get() {
        if (_menu3 != null) return _menu3!!
        _menu3 = tablerOutlineIcon(
            name = "Menu3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h10")
            addPathData("M4 12h16")
            addPathData("M7 12h13")
            addPathData("M4 18h10")
        }
        return _menu3!!
    }

private var _menu3: ImageVector? = null

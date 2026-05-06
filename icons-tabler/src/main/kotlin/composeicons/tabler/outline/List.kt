package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.List: ImageVector
    get() {
        if (_list != null) return _list!!
        _list = tablerOutlineIcon(
            name = "List",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6h11")
            addPathData("M9 12h11")
            addPathData("M9 18h11")
            addPathData("M5 6v.01")
            addPathData("M5 12v.01")
            addPathData("M5 18v.01")
        }
        return _list!!
    }

private var _list: ImageVector? = null

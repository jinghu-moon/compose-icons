package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftBar: ImageVector
    get() {
        if (_arrowLeftBar != null) return _arrowLeftBar!!
        _arrowLeftBar = tablerOutlineIcon(
            name = "ArrowLeftBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12h-18")
            addPathData("M6 9 3 12l3 3")
            addPathData("M21 9v6")
        }
        return _arrowLeftBar!!
    }

private var _arrowLeftBar: ImageVector? = null

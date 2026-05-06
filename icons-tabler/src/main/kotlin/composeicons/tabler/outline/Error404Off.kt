package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Error404Off: ImageVector
    get() {
        if (_error404Off != null) return _error404Off!!
        _error404Off = tablerOutlineIcon(
            name = "Error404Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8v3c0 .552 .448 1 1 1h3")
            addPathData("M7 8v8")
            addPathData("M17 8v3c0 .552 .448 1 1 1h3")
            addPathData("M21 8v8")
            addPathData("M10 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2M14 10C14 8.895 13.105 8 12 8")
            addPathData("M3 3 21 21")
        }
        return _error404Off!!
    }

private var _error404Off: ImageVector? = null

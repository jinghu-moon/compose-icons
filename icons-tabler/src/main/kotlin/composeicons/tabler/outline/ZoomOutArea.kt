package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomOutArea: ImageVector
    get() {
        if (_zoomOutArea != null) return _zoomOutArea!!
        _zoomOutArea = tablerOutlineIcon(
            name = "ZoomOutArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 15h4")
            addPathData("M10 15c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0-2.761-2.239-5-5-5-2.761 0-5 2.239-5 5")
            addPathData("M22 22 19 19")
            addPathData("M6 18h-1C3.895 18 3 17.105 3 16v-1")
            addPathData("M3 11v-1")
            addPathData("M3 6v-1C3 3.895 3.895 3 5 3h1")
            addPathData("M10 3h1")
            addPathData("M15 3h1c1.105 0 2 .895 2 2v1")
        }
        return _zoomOutArea!!
    }

private var _zoomOutArea: ImageVector? = null

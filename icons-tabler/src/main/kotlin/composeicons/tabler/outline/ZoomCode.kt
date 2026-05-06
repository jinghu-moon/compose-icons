package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomCode: ImageVector
    get() {
        if (_zoomCode != null) return _zoomCode!!
        _zoomCode = tablerOutlineIcon(
            name = "ZoomCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C17 6.134 13.866 3 10 3 6.134 3 3 6.134 3 10")
            addPathData("M21 21 15 15")
            addPathData("M8 8 6 10l2 2")
            addPathData("M12 8l2 2-2 2")
        }
        return _zoomCode!!
    }

private var _zoomCode: ImageVector? = null

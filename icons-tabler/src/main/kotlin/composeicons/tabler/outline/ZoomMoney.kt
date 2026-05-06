package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomMoney: ImageVector
    get() {
        if (_zoomMoney != null) return _zoomMoney!!
        _zoomMoney = tablerOutlineIcon(
            name = "ZoomMoney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C17 6.134 13.866 3 10 3 6.134 3 3 6.134 3 10")
            addPathData("M21 21 15 15")
            addPathData("M12 7h-2.5C8.672 7 8 7.672 8 8.5 8 9.328 8.672 10 9.5 10h1c.828 0 1.5 .672 1.5 1.5C12 12.328 11.328 13 10.5 13h-2.5")
            addPathData("M10 13v1M10 6v1")
        }
        return _zoomMoney!!
    }

private var _zoomMoney: ImageVector? = null

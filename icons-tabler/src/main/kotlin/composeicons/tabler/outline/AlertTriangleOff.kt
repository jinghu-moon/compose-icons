package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertTriangleOff: ImageVector
    get() {
        if (_alertTriangleOff != null) return _alertTriangleOff!!
        _alertTriangleOff = tablerOutlineIcon(
            name = "AlertTriangleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.998 17.997c-.014-.307-.101-.606-.255-.872L13.637 3.591C13.29 3.018 12.669 2.669 12 2.669c-.669 0-1.29 .35-1.637 .922L9.323 5.327M7.83 7.82 2.257 17.124c-.34 .589-.342 1.314-.005 1.905 .337 .591 .962 .959 1.641 .966h16.107")
            addPathData("M12 16h.01")
            addPathData("M3 3 21 21")
            addPathData("M12 7v1")
        }
        return _alertTriangleOff!!
    }

private var _alertTriangleOff: ImageVector? = null

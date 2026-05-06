package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScaleOff: ImageVector
    get() {
        if (_scaleOff != null) return _scaleOff!!
        _scaleOff = tablerOutlineIcon(
            name = "ScaleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20h10")
            addPathData("M9.452 5.425 12 5l6 1")
            addPathData("M12 3v5M12 12v8")
            addPathData("M9 12 6 6 3 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
            addPathData("M18.873 14.871C20.137 14.487 21 13.321 21 12L18 6l-2.677 5.355")
            addPathData("M3 3 21 21")
        }
        return _scaleOff!!
    }

private var _scaleOff: ImageVector? = null

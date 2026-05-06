package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Antenna: ImageVector
    get() {
        if (_antenna != null) return _antenna!!
        _antenna = tablerOutlineIcon(
            name = "Antenna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4v8")
            addPathData("M16 4.5v7")
            addPathData("M12 5v16")
            addPathData("M8 5.5v5")
            addPathData("M4 6v4")
            addPathData("M20 8h-16")
        }
        return _antenna!!
    }

private var _antenna: ImageVector? = null

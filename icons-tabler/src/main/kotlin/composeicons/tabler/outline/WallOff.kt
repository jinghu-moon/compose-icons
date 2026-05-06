package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WallOff: ImageVector
    get() {
        if (_wallOff != null) return _wallOff!!
        _wallOff = tablerOutlineIcon(
            name = "WallOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.411 19.417C19.05 19.777 18.551 20 18 20h-12C4.895 20 4 19.105 4 18v-12C4 5.45 4.222 4.953 4.58 4.591")
            addPathData("M4 8h4M12 8h8")
            addPathData("M20 12h-4M12 12h-8")
            addPathData("M4 16h12")
            addPathData("M9 4v1")
            addPathData("M14 8v2")
            addPathData("M8 12v4")
            addPathData("M11 16v4")
            addPathData("M3 3 21 21")
        }
        return _wallOff!!
    }

private var _wallOff: ImageVector? = null

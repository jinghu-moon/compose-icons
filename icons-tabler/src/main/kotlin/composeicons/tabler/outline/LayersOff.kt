package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayersOff: ImageVector
    get() {
        if (_layersOff != null) return _layersOff!!
        _layersOff = tablerOutlineIcon(
            name = "LayersOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.59 4.581C8.952 4.222 9.45 4 10 4h8c1.105 0 2 .895 2 2v8c0 .556-.227 1.06-.594 1.422M16 16h-6C8.895 16 8 15.105 8 14v-6")
            addPathData("M16 16v2c0 1.105-.895 2-2 2h-8C4.895 20 4 19.105 4 18v-8C4 8.895 4.895 8 6 8h2")
            addPathData("M3 3 21 21")
        }
        return _layersOff!!
    }

private var _layersOff: ImageVector? = null

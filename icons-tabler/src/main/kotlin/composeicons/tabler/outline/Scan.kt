package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = tablerOutlineIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7v-1C4 4.895 4.895 4 6 4h2")
            addPathData("M4 17v1c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v1")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-1")
            addPathData("M5 12h14")
        }
        return _scan!!
    }

private var _scan: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ObjectScan: ImageVector
    get() {
        if (_objectScan != null) return _objectScan!!
        _objectScan = tablerOutlineIcon(
            name = "ObjectScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M8 10C8 8.895 8.895 8 10 8h4c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4C8.895 16 8 15.105 8 14v-4")
        }
        return _objectScan!!
    }

private var _objectScan: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScanPosition: ImageVector
    get() {
        if (_scanPosition != null) return _scanPosition!!
        _scanPosition = tablerOutlineIcon(
            name = "ScanPosition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7v-1C4 4.895 4.895 4 6 4h2")
            addPathData("M4 17v1c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v1")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-1")
            addPathData("M12 17 15 9 7 12l3.5 1.5L12 17")
        }
        return _scanPosition!!
    }

private var _scanPosition: ImageVector? = null

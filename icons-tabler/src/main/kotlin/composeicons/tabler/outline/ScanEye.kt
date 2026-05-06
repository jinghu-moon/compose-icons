package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScanEye: ImageVector
    get() {
        if (_scanEye != null) return _scanEye!!
        _scanEye = tablerOutlineIcon(
            name = "ScanEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M7 12c3.333-4.667 6.667-4.667 10 0")
            addPathData("M7 12c3.333 4.667 6.667 4.667 10 0")
            addPathData("M12 12h-.01")
        }
        return _scanEye!!
    }

private var _scanEye: ImageVector? = null

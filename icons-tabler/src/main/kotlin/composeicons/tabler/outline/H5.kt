package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.H5: ImageVector
    get() {
        if (_h5 != null) return _h5!!
        _h5 = tablerOutlineIcon(
            name = "H5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 18h2c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-2v-4h4")
            addPathData("M4 6v12")
            addPathData("M12 6v12")
            addPathData("M11 18h2")
            addPathData("M3 18h2")
            addPathData("M4 12h8")
            addPathData("M3 6h2")
            addPathData("M11 6h2")
        }
        return _h5!!
    }

private var _h5: ImageVector? = null

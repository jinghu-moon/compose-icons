package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = tablerOutlineIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h5.5")
            addPathData("M4 10h5.5")
            addPathData("M4 14h5.5")
            addPathData("M4 18h5.5")
            addPathData("M14.5 6h5.5")
            addPathData("M14.5 10h5.5")
            addPathData("M14.5 14h5.5")
            addPathData("M14.5 18h5.5")
        }
        return _columns!!
    }

private var _columns: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tallymarks: ImageVector
    get() {
        if (_tallymarks != null) return _tallymarks!!
        _tallymarks = tablerOutlineIcon(
            name = "Tallymarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5v14")
            addPathData("M10 5v14")
            addPathData("M14 5v14")
            addPathData("M18 5v14")
            addPathData("M3 17 21 7")
        }
        return _tallymarks!!
    }

private var _tallymarks: ImageVector? = null

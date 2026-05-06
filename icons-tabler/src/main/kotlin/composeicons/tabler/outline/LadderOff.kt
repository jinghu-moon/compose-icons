package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LadderOff: ImageVector
    get() {
        if (_ladderOff != null) return _ladderOff!!
        _ladderOff = tablerOutlineIcon(
            name = "LadderOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3v1M8 8v13")
            addPathData("M16 3v9M16 16v5")
            addPathData("M8 14h6")
            addPathData("M8 10h2M14 10h2")
            addPathData("M10 6h6")
            addPathData("M8 18h8")
            addPathData("M3 3 21 21")
        }
        return _ladderOff!!
    }

private var _ladderOff: ImageVector? = null

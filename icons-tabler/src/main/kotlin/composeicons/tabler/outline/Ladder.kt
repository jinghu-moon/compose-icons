package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = tablerOutlineIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3v18")
            addPathData("M16 3v18")
            addPathData("M8 14h8")
            addPathData("M8 10h8")
            addPathData("M8 6h8")
            addPathData("M8 18h8")
        }
        return _ladder!!
    }

private var _ladder: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronsUp: ImageVector
    get() {
        if (_chevronsUp != null) return _chevronsUp!!
        _chevronsUp = tablerOutlineIcon(
            name = "ChevronsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 11 12 6l5 5")
            addPathData("M7 17l5-5 5 5")
        }
        return _chevronsUp!!
    }

private var _chevronsUp: ImageVector? = null

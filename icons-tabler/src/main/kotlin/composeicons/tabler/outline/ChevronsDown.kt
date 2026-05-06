package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronsDown: ImageVector
    get() {
        if (_chevronsDown != null) return _chevronsDown!!
        _chevronsDown = tablerOutlineIcon(
            name = "ChevronsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7l5 5L17 7")
            addPathData("M7 13l5 5 5-5")
        }
        return _chevronsDown!!
    }

private var _chevronsDown: ImageVector? = null

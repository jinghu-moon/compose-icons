package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerUpRightDouble: ImageVector
    get() {
        if (_cornerUpRightDouble != null) return _cornerUpRightDouble!!
        _cornerUpRightDouble = tablerOutlineIcon(
            name = "CornerUpRightDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v-6C4 10.343 5.343 9 7 9h7")
            addPathData("M10 13 14 9 10 5 15 13 19 9 15 5")
        }
        return _cornerUpRightDouble!!
    }

private var _cornerUpRightDouble: ImageVector? = null

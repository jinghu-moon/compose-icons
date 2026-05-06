package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerLeftDownDouble: ImageVector
    get() {
        if (_cornerLeftDownDouble != null) return _cornerLeftDownDouble!!
        _cornerLeftDownDouble = tablerOutlineIcon(
            name = "CornerLeftDownDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 4h-6C10.343 4 9 5.343 9 7v7")
            addPathData("M13 10 9 14 5 10 13 15 9 19 5 15")
        }
        return _cornerLeftDownDouble!!
    }

private var _cornerLeftDownDouble: ImageVector? = null

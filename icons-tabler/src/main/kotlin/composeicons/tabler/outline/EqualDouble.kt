package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EqualDouble: ImageVector
    get() {
        if (_equalDouble != null) return _equalDouble!!
        _equalDouble = tablerOutlineIcon(
            name = "EqualDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10h7")
            addPathData("M3 14h7")
            addPathData("M14 10h7")
            addPathData("M14 14h7")
        }
        return _equalDouble!!
    }

private var _equalDouble: ImageVector? = null

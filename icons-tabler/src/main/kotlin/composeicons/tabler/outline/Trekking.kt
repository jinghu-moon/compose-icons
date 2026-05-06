package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trekking: ImageVector
    get() {
        if (_trekking != null) return _trekking!!
        _trekking = tablerOutlineIcon(
            name = "Trekking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 3.448 12.552 3 12 3c-.552 0-1 .448-1 1")
            addPathData("M7 21 9 17")
            addPathData("M13 21v-4L10 14 11 8l3 4 3 2")
            addPathData("M10 14 8.173 12.782C7.469 12.313 7.137 11.452 7.342 10.632L7.622 9.515C7.844 8.625 8.644 8.001 9.561 8h1.439l4 1L18 7")
            addPathData("M17 12v9")
            addPathData("M16 20h2")
        }
        return _trekking!!
    }

private var _trekking: ImageVector? = null

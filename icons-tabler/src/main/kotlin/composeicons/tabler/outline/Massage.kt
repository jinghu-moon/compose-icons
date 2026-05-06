package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Massage: ImageVector
    get() {
        if (_massage != null) return _massage!!
        _massage = tablerOutlineIcon(
            name = "Massage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1C5 16.448 4.552 16 4 16c-.552 0-1 .448-1 1")
            addPathData("M8 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C10 4.448 9.552 4 9 4 8.448 4 8 4.448 8 5")
            addPathData("M4 22 8 20v-3h12")
            addPathData("M11 20h9")
            addPathData("M8 14l3-2L12 8c3 1 3 4 3 6")
        }
        return _massage!!
    }

private var _massage: ImageVector? = null

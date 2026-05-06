package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bold: ImageVector
    get() {
        if (_bold != null) return _bold!!
        _bold = tablerOutlineIcon(
            name = "Bold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 5h6c1.933 0 3.5 1.567 3.5 3.5C16.5 10.433 14.933 12 13 12h-6v-7")
            addPathData("M13 12h1c1.933 0 3.5 1.567 3.5 3.5C17.5 17.433 15.933 19 14 19h-7v-7")
        }
        return _bold!!
    }

private var _bold: ImageVector? = null

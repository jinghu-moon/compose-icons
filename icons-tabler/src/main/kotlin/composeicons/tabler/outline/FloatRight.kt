package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FloatRight: ImageVector
    get() {
        if (_floatRight != null) return _floatRight!!
        _floatRight = tablerOutlineIcon(
            name = "FloatRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-4")
            addPathData("M4 7h6")
            addPathData("M4 11h6")
            addPathData("M4 15h16")
            addPathData("M4 19h16")
        }
        return _floatRight!!
    }

private var _floatRight: ImageVector? = null

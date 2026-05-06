package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Italic: ImageVector
    get() {
        if (_italic != null) return _italic!!
        _italic = tablerOutlineIcon(
            name = "Italic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5h6")
            addPathData("M7 19h6")
            addPathData("M14 5 10 19")
        }
        return _italic!!
    }

private var _italic: ImageVector? = null

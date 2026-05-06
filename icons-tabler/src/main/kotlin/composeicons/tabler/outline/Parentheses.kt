package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Parentheses: ImageVector
    get() {
        if (_parentheses != null) return _parentheses!!
        _parentheses = tablerOutlineIcon(
            name = "Parentheses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 4C3.036 8.597 3.036 15.403 7 20")
            addPathData("M17 4c3.964 4.597 3.964 11.403 0 16")
        }
        return _parentheses!!
    }

private var _parentheses: ImageVector? = null

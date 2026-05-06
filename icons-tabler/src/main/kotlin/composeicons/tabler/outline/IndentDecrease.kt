package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IndentDecrease: ImageVector
    get() {
        if (_indentDecrease != null) return _indentDecrease!!
        _indentDecrease = tablerOutlineIcon(
            name = "IndentDecrease",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6h-7")
            addPathData("M20 12h-9")
            addPathData("M20 18h-7")
            addPathData("M8 8 4 12l4 4")
        }
        return _indentDecrease!!
    }

private var _indentDecrease: ImageVector? = null

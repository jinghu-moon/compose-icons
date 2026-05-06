package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Background: ImageVector
    get() {
        if (_background != null) return _background!!
        _background = tablerOutlineIcon(
            name = "Background",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8 8 4")
            addPathData("M14 4 4 14")
            addPathData("M4 20 20 4")
            addPathData("M20 10 10 20")
            addPathData("M20 16l-4 4")
        }
        return _background!!
    }

private var _background: ImageVector? = null

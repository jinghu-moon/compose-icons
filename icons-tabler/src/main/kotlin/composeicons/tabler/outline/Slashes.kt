package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Slashes: ImageVector
    get() {
        if (_slashes != null) return _slashes!!
        _slashes = tablerOutlineIcon(
            name = "Slashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 5 4 19")
            addPathData("M20 5 10 19")
        }
        return _slashes!!
    }

private var _slashes: ImageVector? = null

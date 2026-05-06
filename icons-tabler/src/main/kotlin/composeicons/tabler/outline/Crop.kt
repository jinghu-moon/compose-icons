package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = tablerOutlineIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 5v10c0 .552 .448 1 1 1h10")
            addPathData("M5 8h10c.552 0 1 .448 1 1v10")
        }
        return _crop!!
    }

private var _crop: ImageVector? = null

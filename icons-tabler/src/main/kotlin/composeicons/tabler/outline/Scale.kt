package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Scale: ImageVector
    get() {
        if (_scale != null) return _scale!!
        _scale = tablerOutlineIcon(
            name = "Scale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20h10")
            addPathData("M6 6 12 5l6 1")
            addPathData("M12 3v17")
            addPathData("M9 12 6 6 3 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
            addPathData("M21 12 18 6l-3 6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
        }
        return _scale!!
    }

private var _scale: ImageVector? = null

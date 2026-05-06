package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Grid3X3: ImageVector
    get() {
        if (_grid3X3 != null) return _grid3X3!!
        _grid3X3 = tablerOutlineIcon(
            name = "Grid3X3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8h18")
            addPathData("M3 16h18")
            addPathData("M8 3v18")
            addPathData("M16 3v18")
        }
        return _grid3X3!!
    }

private var _grid3X3: ImageVector? = null

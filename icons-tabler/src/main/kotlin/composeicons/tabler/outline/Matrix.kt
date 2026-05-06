package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Matrix: ImageVector
    get() {
        if (_matrix != null) return _matrix!!
        _matrix = tablerOutlineIcon(
            name = "Matrix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16h.013")
            addPathData("M12.01 16h.005")
            addPathData("M16.015 16h.005")
            addPathData("M16.015 12h.005")
            addPathData("M8.01 12h.005")
            addPathData("M12.01 12h.005")
            addPathData("M16.02 8h.005")
            addPathData("M8.015 8h.005")
            addPathData("M12.015 8h.005")
            addPathData("M7 4h-1C4.895 4 4 4.895 4 6v12c0 1.105 .895 2 2 2h1")
            addPathData("M17 4h1c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-1")
        }
        return _matrix!!
    }

private var _matrix: ImageVector? = null

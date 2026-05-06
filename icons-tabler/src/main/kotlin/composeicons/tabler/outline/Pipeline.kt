package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pipeline: ImageVector
    get() {
        if (_pipeline != null) return _pipeline!!
        _pipeline = tablerOutlineIcon(
            name = "Pipeline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4h8")
            addPathData("M4 4v5c0 3.314 2.686 6 6 6h3c.552 0 1 .448 1 1v4")
            addPathData("M10 4v4c0 .552 .448 1 1 1h3c3.314 0 6 2.686 6 6v5")
            addPathData("M13 20h8")
            addPathData("M12 9v6")
        }
        return _pipeline!!
    }

private var _pipeline: ImageVector? = null

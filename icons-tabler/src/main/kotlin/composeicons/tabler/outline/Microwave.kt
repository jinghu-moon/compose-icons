package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Microwave: ImageVector
    get() {
        if (_microwave != null) return _microwave!!
        _microwave = tablerOutlineIcon(
            name = "Microwave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 6.448 3.448 6 4 6h16c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-16C3.448 18 3 17.552 3 17v-10")
            addPathData("M15 6v12")
            addPathData("M18 12h.01")
            addPathData("M18 15h.01")
            addPathData("M18 9h.01")
            addPathData("M6.5 10.5c1-.667 1.5-.667 2.5 0 .833 .347 1.667 .926 2.5 0")
            addPathData("M6.5 13.5c1-.667 1.5-.667 2.5 0 .833 .347 1.667 .926 2.5 0")
        }
        return _microwave!!
    }

private var _microwave: ImageVector? = null

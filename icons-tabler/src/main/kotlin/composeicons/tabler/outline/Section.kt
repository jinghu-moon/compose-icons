package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Section: ImageVector
    get() {
        if (_section != null) return _section!!
        _section = tablerOutlineIcon(
            name = "Section",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 20h.01")
            addPathData("M4 20h.01")
            addPathData("M8 20h.01")
            addPathData("M12 20h.01")
            addPathData("M16 20h.01")
            addPathData("M20 4h.01")
            addPathData("M4 4h.01")
            addPathData("M8 4h.01")
            addPathData("M12 4h.01")
            addPathData("M16 4v.01")
            addPathData("M4 9C4 8.448 4.448 8 5 8h14c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-14C4.448 16 4 15.552 4 15v-6")
        }
        return _section!!
    }

private var _section: ImageVector? = null

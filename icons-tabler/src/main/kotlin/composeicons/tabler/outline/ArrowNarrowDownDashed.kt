package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowNarrowDownDashed: ImageVector
    get() {
        if (_arrowNarrowDownDashed != null) return _arrowNarrowDownDashed!!
        _arrowNarrowDownDashed = tablerOutlineIcon(
            name = "ArrowNarrowDownDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5v.5M12 8.5v1.5M12 13v6")
            addPathData("M16 15l-4 4")
            addPathData("M8 15l4 4")
        }
        return _arrowNarrowDownDashed!!
    }

private var _arrowNarrowDownDashed: ImageVector? = null

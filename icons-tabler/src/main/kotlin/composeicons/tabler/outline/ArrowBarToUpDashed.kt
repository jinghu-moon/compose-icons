package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarToUpDashed: ImageVector
    get() {
        if (_arrowBarToUpDashed != null) return _arrowBarToUpDashed!!
        _arrowBarToUpDashed = tablerOutlineIcon(
            name = "ArrowBarToUpDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10v10")
            addPathData("M12 10l4 4")
            addPathData("M12 10 8 14")
            addPathData("M4 4h3M20 4h-3M13.5 4h-3")
        }
        return _arrowBarToUpDashed!!
    }

private var _arrowBarToUpDashed: ImageVector? = null

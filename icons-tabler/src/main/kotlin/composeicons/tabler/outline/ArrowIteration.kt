package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowIteration: ImageVector
    get() {
        if (_arrowIteration != null) return _arrowIteration!!
        _arrowIteration = tablerOutlineIcon(
            name = "ArrowIteration",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.5 16C11.538 16 14 13.538 14 10.5 14 7.462 11.538 5 8.5 5 5.462 5 3 7.462 3 10.5v.5")
            addPathData("M3 16h18")
            addPathData("M18 13l3 3-3 3")
        }
        return _arrowIteration!!
    }

private var _arrowIteration: ImageVector? = null

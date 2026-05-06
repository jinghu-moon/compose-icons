package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = tablerOutlineIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5v14")
            addPathData("M18 13l-6 6")
            addPathData("M6 13l6 6")
        }
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null

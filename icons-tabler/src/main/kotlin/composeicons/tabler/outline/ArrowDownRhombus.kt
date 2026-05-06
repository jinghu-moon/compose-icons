package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownRhombus: ImageVector
    get() {
        if (_arrowDownRhombus != null) return _arrowDownRhombus!!
        _arrowDownRhombus = tablerOutlineIcon(
            name = "ArrowDownRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8v13")
            addPathData("M15 18l-3 3L9 18")
            addPathData("M14.5 5.5 12 3 9.5 5.5 12 8 14.5 5.5")
        }
        return _arrowDownRhombus!!
    }

private var _arrowDownRhombus: ImageVector? = null

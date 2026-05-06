package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpRhombus: ImageVector
    get() {
        if (_arrowUpRhombus != null) return _arrowUpRhombus!!
        _arrowUpRhombus = tablerOutlineIcon(
            name = "ArrowUpRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16v-13")
            addPathData("M15 6 12 3 9 6")
            addPathData("M14.5 18.5 12 21 9.5 18.5 12 16l2.5 2.5")
        }
        return _arrowUpRhombus!!
    }

private var _arrowUpRhombus: ImageVector? = null

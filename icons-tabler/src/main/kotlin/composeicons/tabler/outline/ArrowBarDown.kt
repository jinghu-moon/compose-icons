package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarDown: ImageVector
    get() {
        if (_arrowBarDown != null) return _arrowBarDown!!
        _arrowBarDown = tablerOutlineIcon(
            name = "ArrowBarDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20v-10")
            addPathData("M12 20l4-4")
            addPathData("M12 20 8 16")
            addPathData("M4 4h16")
        }
        return _arrowBarDown!!
    }

private var _arrowBarDown: ImageVector? = null

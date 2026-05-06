package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockMinus: ImageVector
    get() {
        if (_clockMinus != null) return _clockMinus!!
        _clockMinus = tablerOutlineIcon(
            name = "ClockMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.477 15.022C21.809 11.286 20.538 7.118 17.347 4.761 14.156 2.404 9.799 2.414 6.619 4.785 3.439 7.157 2.187 11.331 3.536 15.061c1.349 3.73 4.982 6.137 8.943 5.926")
            addPathData("M12 7v5l3 3")
            addPathData("M16 19h6")
        }
        return _clockMinus!!
    }

private var _clockMinus: ImageVector? = null

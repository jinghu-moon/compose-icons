package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = tablerOutlineIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 10 12 4 6 10h12")
            addPathData("M18 14l-6 6L6 14h12")
        }
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null

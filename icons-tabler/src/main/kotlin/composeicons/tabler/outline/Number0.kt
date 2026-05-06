package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number0: ImageVector
    get() {
        if (_number0 != null) return _number0!!
        _number0 = tablerOutlineIcon(
            name = "Number0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 16v-8")
            addPathData("M12 20c2.209 0 4-1.791 4-4v-8C16 5.791 14.209 4 12 4 9.791 4 8 5.791 8 8v8c0 2.209 1.791 4 4 4")
        }
        return _number0!!
    }

private var _number0: ImageVector? = null

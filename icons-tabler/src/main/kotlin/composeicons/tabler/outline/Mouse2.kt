package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mouse2: ImageVector
    get() {
        if (_mouse2 != null) return _mouse2!!
        _mouse2 = tablerOutlineIcon(
            name = "Mouse2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 7C6 4.791 7.791 3 10 3h4c2.209 0 4 1.791 4 4v10c0 2.209-1.791 4-4 4h-4C7.791 21 6 19.209 6 17v-10")
            addPathData("M12 3v7")
            addPathData("M6 10h12")
        }
        return _mouse2!!
    }

private var _mouse2: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Joker: ImageVector
    get() {
        if (_joker != null) return _joker!!
        _joker = tablerOutlineIcon(
            name = "Joker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 17.5C5 16.672 5.672 16 6.5 16h11c.828 0 1.5 .672 1.5 1.5C19 18.328 18.328 19 17.5 19h-11C5.672 19 5 18.328 5 17.5")
            addPathData("M12 16Q9.5 8 6 8 3.5 8 3 10c2.953 .31 3.308 3.33 4 6")
            addPathData("M12 16Q14.5 8 18 8q2.5 0 3 2c-2.953 .31-3.308 3.33-4 6")
            addPathData("M9 9.5Q11 6 12 6q1 0 3 3.5")
        }
        return _joker!!
    }

private var _joker: ImageVector? = null

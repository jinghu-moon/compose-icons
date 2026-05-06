package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxMultiple3: ImageVector
    get() {
        if (_boxMultiple3 != null) return _boxMultiple3!!
        _boxMultiple3 = tablerOutlineIcon(
            name = "BoxMultiple3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 5C7 3.895 7.895 3 9 3h10c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-10C7.895 17 7 16.105 7 15v-10")
            addPathData("M17 17v2c0 1.105-.895 2-2 2h-10C3.895 21 3 20.105 3 19v-10C3 7.895 3.895 7 5 7h2")
            addPathData("M14 10c1.105 0 2-.895 2-2C16 6.895 15.105 6 14 6c-1.105 0-2 .895-2 2")
            addPathData("M12 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2")
        }
        return _boxMultiple3!!
    }

private var _boxMultiple3: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Snowman: ImageVector
    get() {
        if (_snowman != null) return _snowman!!
        _snowman = tablerOutlineIcon(
            name = "Snowman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c1.598-.001 3.043 .95 3.675 2.418 .632 1.468 .33 3.171-.769 4.332 2.394 1.325 3.588 4.101 2.904 6.75-.684 2.649-3.074 4.5-5.809 4.5-2.736 0-5.125-1.851-5.809-4.5C5.508 13.851 6.702 11.075 9.096 9.75 7.997 8.59 7.695 6.887 8.326 5.419 8.958 3.951 10.402 3 12 3")
            addPathData("M17.5 11.5 20 10")
            addPathData("M6.5 11.5 4 10")
            addPathData("M12 13h.01")
            addPathData("M12 16h.01")
        }
        return _snowman!!
    }

private var _snowman: ImageVector? = null

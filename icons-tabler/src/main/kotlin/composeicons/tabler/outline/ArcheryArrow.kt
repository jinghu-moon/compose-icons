package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArcheryArrow: ImageVector
    get() {
        if (_archeryArrow != null) return _archeryArrow!!
        _archeryArrow = tablerOutlineIcon(
            name = "ArcheryArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 7v3h3L20 7h-3v-3L14 7")
            addPathData("M14 10 5 19")
            addPathData("M5 15v4h4")
        }
        return _archeryArrow!!
    }

private var _archeryArrow: ImageVector? = null

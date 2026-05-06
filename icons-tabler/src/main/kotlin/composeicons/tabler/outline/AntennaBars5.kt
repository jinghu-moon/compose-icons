package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AntennaBars5: ImageVector
    get() {
        if (_antennaBars5 != null) return _antennaBars5!!
        _antennaBars5 = tablerOutlineIcon(
            name = "AntennaBars5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 18v-3")
            addPathData("M10 18v-6")
            addPathData("M14 18v-9")
            addPathData("M18 18v-12")
        }
        return _antennaBars5!!
    }

private var _antennaBars5: ImageVector? = null

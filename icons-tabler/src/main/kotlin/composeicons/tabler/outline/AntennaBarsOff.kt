package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AntennaBarsOff: ImageVector
    get() {
        if (_antennaBarsOff != null) return _antennaBarsOff!!
        _antennaBarsOff = tablerOutlineIcon(
            name = "AntennaBarsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 18v-3")
            addPathData("M10 18v-6")
            addPathData("M14 18v-4")
            addPathData("M14 10v-1")
            addPathData("M18 14v-8")
            addPathData("M3 3 21 21")
        }
        return _antennaBarsOff!!
    }

private var _antennaBarsOff: ImageVector? = null

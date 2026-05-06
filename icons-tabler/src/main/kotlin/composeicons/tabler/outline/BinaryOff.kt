package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BinaryOff: ImageVector
    get() {
        if (_binaryOff != null) return _binaryOff!!
        _binaryOff = tablerOutlineIcon(
            name = "BinaryOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7v-2h-1")
            addPathData("M18 19v-1")
            addPathData("M15.5 5h2c.276 0 .5 .224 .5 .5v4c0 .276-.224 .5-.5 .5h-2C15.224 10 15 9.776 15 9.5v-4C15 5.224 15.224 5 15.5 5")
            addPathData("M10.5 14h2c.276 0 .5 .224 .5 .5v4c0 .276-.224 .5-.5 .5h-2C10.224 19 10 18.776 10 18.5v-4c0-.276 .224-.5 .5-.5")
            addPathData("M6 10v.01")
            addPathData("M6 19v.01")
            addPathData("M3 3 21 21")
        }
        return _binaryOff!!
    }

private var _binaryOff: ImageVector? = null

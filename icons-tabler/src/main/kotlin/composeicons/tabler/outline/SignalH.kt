package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SignalH: ImageVector
    get() {
        if (_signalH != null) return _signalH!!
        _signalH = tablerOutlineIcon(
            name = "SignalH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16v-8")
            addPathData("M14 8v8")
            addPathData("M10 12h4")
        }
        return _signalH!!
    }

private var _signalH: ImageVector? = null

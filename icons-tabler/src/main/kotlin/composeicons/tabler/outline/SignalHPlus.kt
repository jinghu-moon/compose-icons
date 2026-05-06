package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SignalHPlus: ImageVector
    get() {
        if (_signalHPlus != null) return _signalHPlus!!
        _signalHPlus = tablerOutlineIcon(
            name = "SignalHPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 16v-8")
            addPathData("M11 8v8")
            addPathData("M7 12h4")
            addPathData("M14 12h4")
            addPathData("M16 10v4")
        }
        return _signalHPlus!!
    }

private var _signalHPlus: ImageVector? = null

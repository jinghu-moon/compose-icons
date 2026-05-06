package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SignalLte: ImageVector
    get() {
        if (_signalLte != null) return _signalLte!!
        _signalLte = tablerOutlineIcon(
            name = "SignalLte",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8h-4v8h4")
            addPathData("M17 12h2.5")
            addPathData("M4 8v8h4")
            addPathData("M10 8h4")
            addPathData("M12 8v8")
        }
        return _signalLte!!
    }

private var _signalLte: ImageVector? = null

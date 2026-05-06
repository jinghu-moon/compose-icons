package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitAmmeter: ImageVector
    get() {
        if (_circuitAmmeter != null) return _circuitAmmeter!!
        _circuitAmmeter = tablerOutlineIcon(
            name = "CircuitAmmeter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 8.134 15.866 5 12 5 8.134 5 5 8.134 5 12")
            addPathData("M5 12h-3")
            addPathData("M19 12h3")
            addPathData("M10 14v-3c0-1.036 .895-2 2-2 1.105 0 2 .964 2 2v3")
            addPathData("M14 12h-4")
        }
        return _circuitAmmeter!!
    }

private var _circuitAmmeter: ImageVector? = null

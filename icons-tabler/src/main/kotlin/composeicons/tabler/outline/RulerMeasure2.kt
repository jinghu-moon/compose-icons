package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RulerMeasure2: ImageVector
    get() {
        if (_rulerMeasure2 != null) return _rulerMeasure2!!
        _rulerMeasure2 = tablerOutlineIcon(
            name = "RulerMeasure2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19.875C12 20.496 11.488 21 10.857 21h-5.714c-.301 .002-.59-.115-.805-.326C4.124 20.463 4.002 20.176 4 19.875v-15.875C4 3.448 4.448 3 5 3h5.857C11.488 3 12 3.504 12 4.125v15.75")
            addPathData("M12 9h-2")
            addPathData("M12 6h-3")
            addPathData("M12 12h-3")
            addPathData("M12 18h-3")
            addPathData("M12 15h-2")
            addPathData("M21 3h-4")
            addPathData("M19 3v18")
            addPathData("M21 21h-4")
        }
        return _rulerMeasure2!!
    }

private var _rulerMeasure2: ImageVector? = null

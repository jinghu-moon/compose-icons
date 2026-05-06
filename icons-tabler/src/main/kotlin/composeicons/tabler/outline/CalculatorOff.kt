package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalculatorOff: ImageVector
    get() {
        if (_calculatorOff != null) return _calculatorOff!!
        _calculatorOff = tablerOutlineIcon(
            name = "CalculatorOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.823 19.824C19.499 20.54 18.786 21 18 21h-12C4.895 21 4 20.105 4 19v-14c0-.295 .064-.575 .178-.827M7 3h11c1.105 0 2 .895 2 2v11")
            addPathData("M10 10h-1C8.448 10 8 9.552 8 9v-1M11 7h4c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-1")
            addPathData("M8 14v.01")
            addPathData("M12 14v.01")
            addPathData("M8 17v.01")
            addPathData("M12 17v.01")
            addPathData("M16 17v.01")
            addPathData("M3 3 21 21")
        }
        return _calculatorOff!!
    }

private var _calculatorOff: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsCode: ImageVector
    get() {
        if (_adjustmentsCode != null) return _adjustmentsCode!!
        _adjustmentsCode = tablerOutlineIcon(
            name = "AdjustmentsCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M13.557 14.745c-.585-.726-1.593-.951-2.431-.544-.838 .407-1.284 1.339-1.075 2.247 .209 .908 1.017 1.552 1.949 1.551")
            addPathData("M12 4v10")
            addPathData("M12 18v2")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M18 9v4")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _adjustmentsCode!!
    }

private var _adjustmentsCode: ImageVector? = null

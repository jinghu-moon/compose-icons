package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tax: ImageVector
    get() {
        if (_tax != null) return _tax!!
        _tax = tablerOutlineIcon(
            name = "Tax",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.487 21h7.026c1.278-0 2.479-.611 3.232-1.644 .753-1.033 .967-2.363 .576-3.58L17.615 10.47C16.95 8.402 15.027 7 12.855 7h-1.71C8.973 7 7.05 8.402 6.385 10.47L4.679 15.776c-.391 1.217-.177 2.547 .576 3.58 .753 1.033 1.954 1.644 3.232 1.644")
            addPathData("M15 3Q14 7 12 7 10 7 9 3h6")
            addPathData("M14 11h-2.5C10.672 11 10 11.672 10 12.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C14 16.328 13.328 17 12.5 17h-2.5")
            addPathData("M12 10v1")
            addPathData("M12 17v1")
        }
        return _tax!!
    }

private var _tax: ImageVector? = null

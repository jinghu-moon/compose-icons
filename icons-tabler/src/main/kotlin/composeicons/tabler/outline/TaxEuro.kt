package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TaxEuro: ImageVector
    get() {
        if (_taxEuro != null) return _taxEuro!!
        _taxEuro = tablerOutlineIcon(
            name = "TaxEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.487 21h7.026c1.278-0 2.479-.611 3.232-1.644 .753-1.033 .967-2.363 .576-3.58L17.615 10.47C16.95 8.402 15.027 7 12.855 7h-1.71C8.973 7 7.05 8.402 6.385 10.47L4.679 15.776c-.391 1.217-.177 2.547 .576 3.58 .753 1.033 1.954 1.644 3.232 1.644")
            addPathData("M15 3Q14 7 12 7 10 7 9 3h6")
            addPathData("M12 14h-3")
            addPathData("M14 11.172c-1.243-.44-2.628-.017-3.413 1.044-.785 1.06-.785 2.509 0 3.569 .785 1.06 2.169 1.484 3.413 1.044")
        }
        return _taxEuro!!
    }

private var _taxEuro: ImageVector? = null

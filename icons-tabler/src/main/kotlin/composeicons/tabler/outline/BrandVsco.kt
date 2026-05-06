package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVsco: ImageVector
    get() {
        if (_brandVsco != null) return _brandVsco!!
        _brandVsco = tablerOutlineIcon(
            name = "BrandVsco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9")
            addPathData("M17 12C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5")
            addPathData("M12 3v4")
            addPathData("M21 12h-4")
            addPathData("M12 21v-4")
            addPathData("M3 12h4")
            addPathData("M18.364 5.636 15.536 8.464")
            addPathData("M18.364 18.364 15.536 15.536")
            addPathData("M5.636 18.364 8.464 15.536")
            addPathData("M5.636 5.636 8.464 8.464")
        }
        return _brandVsco!!
    }

private var _brandVsco: ImageVector? = null

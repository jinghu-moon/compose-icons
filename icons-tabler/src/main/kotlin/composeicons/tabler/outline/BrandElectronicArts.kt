package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandElectronicArts: ImageVector
    get() {
        if (_brandElectronicArts != null) return _brandElectronicArts!!
        _brandElectronicArts = tablerOutlineIcon(
            name = "BrandElectronicArts",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M17.5 15l-3-6-3 6h-5L8 12")
            addPathData("M17 14h-2")
            addPathData("M6.5 12h3.5")
            addPathData("M8 9h3")
        }
        return _brandElectronicArts!!
    }

private var _brandElectronicArts: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZapier: ImageVector
    get() {
        if (_brandZapier != null) return _brandZapier!!
        _brandZapier = tablerOutlineIcon(
            name = "BrandZapier",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h6")
            addPathData("M21 12h-6")
            addPathData("M12 3v6")
            addPathData("M12 15v6")
            addPathData("M5.636 5.636 9.879 9.879")
            addPathData("M18.364 18.364 14.121 14.121")
            addPathData("M18.364 5.636 14.121 9.879")
            addPathData("M9.879 14.121 5.636 18.364")
        }
        return _brandZapier!!
    }

private var _brandZapier: ImageVector? = null

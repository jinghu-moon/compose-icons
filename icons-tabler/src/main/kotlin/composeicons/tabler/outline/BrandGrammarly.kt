package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGrammarly: ImageVector
    get() {
        if (_brandGrammarly != null) return _brandGrammarly!!
        _brandGrammarly = tablerOutlineIcon(
            name = "BrandGrammarly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M15.697 9.434C14.554 7.787 12.458 7.095 10.559 7.738 8.66 8.38 7.414 10.201 7.505 12.204c.091 2.003 1.496 3.704 3.445 4.172 1.95 .468 3.974-.411 4.963-2.154")
            addPathData("M13.5 14h2.5v2.5")
        }
        return _brandGrammarly!!
    }

private var _brandGrammarly: ImageVector? = null

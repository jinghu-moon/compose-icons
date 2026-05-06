package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVolkswagen: ImageVector
    get() {
        if (_brandVolkswagen != null) return _brandVolkswagen!!
        _brandVolkswagen = tablerOutlineIcon(
            name = "BrandVolkswagen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M5 7 9.5 18 11 13h2l1.5 5L19 7")
            addPathData("M9 4l2 6h2L15 4")
        }
        return _brandVolkswagen!!
    }

private var _brandVolkswagen: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCodepen: ImageVector
    get() {
        if (_brandCodepen != null) return _brandCodepen!!
        _brandCodepen = tablerOutlineIcon(
            name = "BrandCodepen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15l9 6 9-6L12 9 3 15")
            addPathData("M3 9l9 6L21 9 12 3 3 9")
            addPathData("M3 9v6")
            addPathData("M21 9v6")
            addPathData("M12 3v6")
            addPathData("M12 15v6")
        }
        return _brandCodepen!!
    }

private var _brandCodepen: ImageVector? = null

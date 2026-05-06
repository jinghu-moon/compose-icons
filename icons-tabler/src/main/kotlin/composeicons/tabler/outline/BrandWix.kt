package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWix: ImageVector
    get() {
        if (_brandWix != null) return _brandWix!!
        _brandWix = tablerOutlineIcon(
            name = "BrandWix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9l1.5 6L5.879 9.485c.071-.285 .327-.485 .621-.485 .294 0 .55 .2 .621 .485L8.5 15 10 9")
            addPathData("M13 11.5v3.5")
            addPathData("M16 9l5 6")
            addPathData("M21 9l-5 6")
            addPathData("M13 9h.01")
        }
        return _brandWix!!
    }

private var _brandWix: ImageVector? = null

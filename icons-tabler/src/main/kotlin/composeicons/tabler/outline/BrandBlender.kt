package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBlender: ImageVector
    get() {
        if (_brandBlender != null) return _brandBlender!!
        _brandBlender = tablerOutlineIcon(
            name = "BrandBlender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 14c0 2.761 2.686 5 6 5 3.314 0 6-2.239 6-5C21 11.239 18.314 9 15 9 11.686 9 9 11.239 9 14")
            addPathData("M14 14c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M3 16 12 9.5")
            addPathData("M6 9h9")
            addPathData("M13 5l5.65 5")
        }
        return _brandBlender!!
    }

private var _brandBlender: ImageVector? = null

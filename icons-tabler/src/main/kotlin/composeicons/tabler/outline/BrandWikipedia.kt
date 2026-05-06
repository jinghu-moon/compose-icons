package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWikipedia: ImageVector
    get() {
        if (_brandWikipedia != null) return _brandWikipedia!!
        _brandWikipedia = tablerOutlineIcon(
            name = "BrandWikipedia",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4.984h2")
            addPathData("M8 4.984h2.5")
            addPathData("M14.5 4.984h2.5")
            addPathData("M22 4.984h-2")
            addPathData("M4 4.984 9.455 19.5 16 4.984")
            addPathData("M9 4.984l6 14.516L21 4.984")
        }
        return _brandWikipedia!!
    }

private var _brandWikipedia: ImageVector? = null

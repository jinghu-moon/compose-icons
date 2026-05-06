package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCouchsurfing: ImageVector
    get() {
        if (_brandCouchsurfing != null) return _brandCouchsurfing!!
        _brandCouchsurfing = tablerOutlineIcon(
            name = "BrandCouchsurfing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.1 13C6.367 13 9 12.833 11 12.5 14 12 15 10.5 15 9 15 7.343 13.657 6 12 6 10.343 6 9 7.343 9 9c0 1.554 1.807 3 3 4 1.193 1 2 2.5 2 3.5C14 17.328 13.328 18 12.5 18 11.672 18 11 17.328 11 16.5 11 14.5 15 13 18 13h2.9")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _brandCouchsurfing!!
    }

private var _brandCouchsurfing: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ad: ImageVector
    get() {
        if (_ad != null) return _ad!!
        _ad = tablerOutlineIcon(
            name = "Ad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M7 15v-4C7 9.895 7.895 9 9 9c1.105 0 2 .895 2 2v4")
            addPathData("M7 13h4")
            addPathData("M17 9v6h-1.5C14.672 15 14 14.328 14 13.5 14 12.672 14.672 12 15.5 12c.828 0 1.5 .672 1.5 1.5")
        }
        return _ad!!
    }

private var _ad: ImageVector? = null

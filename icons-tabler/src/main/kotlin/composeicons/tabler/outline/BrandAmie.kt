package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmie: ImageVector
    get() {
        if (_brandAmie != null) return _brandAmie!!
        _brandAmie = tablerOutlineIcon(
            name = "BrandAmie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8.5C3 9.83 3.472 11.05 4.257 12c-1.805 2.186-1.653 5.386 .352 7.391 2.005 2.005 5.205 2.157 7.391 .352 2.186 1.805 5.386 1.653 7.391-.352 2.005-2.005 2.157-5.205 .352-7.391C21.548 9.814 21.396 6.614 19.391 4.609 17.386 2.604 14.186 2.452 12 4.257 10.358 2.902 8.081 2.617 6.155 3.525 4.229 4.433 3 6.371 3 8.5")
            addPathData("M10 9.5C10 8.672 10.895 8 12 8c1.105 0 2 .672 2 1.5v5C14 15.328 13.105 16 12 16c-1.105 0-2-.672-2-1.5v-5")
        }
        return _brandAmie!!
    }

private var _brandAmie: ImageVector? = null

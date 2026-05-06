package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDisney: ImageVector
    get() {
        if (_brandDisney != null) return _brandDisney!!
        _brandDisney = tablerOutlineIcon(
            name = "BrandDisney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.22 5.838C1.913 5.688 2 5.26 2 5.044 2 4.828 2.424 4 6.34 4 11.034 4 21 7.645 21 14.042c0 6.397-8.71 4.931-10.435 4.52C8.841 18.15 5 16.306 5 14.388 5 12.993 8.08 12 11.715 12 15.349 12 17 13.041 17 14c0 .5-.074 1.229-1 1.5")
            addPathData("M10.02 8c-.056 4.333-.056 8.667 0 13")
        }
        return _brandDisney!!
    }

private var _brandDisney: ImageVector? = null

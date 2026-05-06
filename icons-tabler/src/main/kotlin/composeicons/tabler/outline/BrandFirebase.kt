package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFirebase: ImageVector
    get() {
        if (_brandFirebase != null) return _brandFirebase!!
        _brandFirebase = tablerOutlineIcon(
            name = "BrandFirebase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.53 17.05 10.68 5.33h-.02c.38-.74 1.28-1.02 2.01-.63 .26 .14 .48 .36 .62 .62l1.06 2.01")
            addPathData("M15.47 6.45c.58-.59 1.53-.59 2.11-.01 .22 .22 .36 .5 .41 .81l1.5 9.11c.1 .62-.2 1.24-.76 1.54l-6.07 2.9c-.46 .25-1.01 .26-1.46 0L5.18 17.88c-.55-.31-.85-.92-.75-1.54L6.39 4.3C6.51 3.48 7.28 2.92 8.09 3.05c.46 .07 .87 .36 1.09 .77l1.24 1.76")
            addPathData("M4.57 17.18 15.5 6.5")
        }
        return _brandFirebase!!
    }

private var _brandFirebase: ImageVector? = null

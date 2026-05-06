package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDrops: ImageVector
    get() {
        if (_brandDrops != null) return _brandDrops!!
        _brandDrops = tablerOutlineIcon(
            name = "BrandDrops",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.637 7.416c2.298 2.26 2.994 5.689 1.76 8.666C18.152 19.065 15.233 21.006 12 21 8.767 21.005 5.849 19.065 4.604 16.082 3.369 13.105 4.065 9.676 6.363 7.416L12 2l5.637 5.416")
            addPathData("M14.466 10.923c1.008 1.023 1.311 2.547 .77 3.877C14.706 16.124 13.426 16.994 12 17 10.574 16.994 9.294 16.124 8.764 14.8c-.541-1.33-.238-2.854 .77-3.877L12 8.5l2.466 2.423")
        }
        return _brandDrops!!
    }

private var _brandDrops: ImageVector? = null

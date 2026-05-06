package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trowel: ImageVector
    get() {
        if (_trowel != null) return _trowel!!
        _trowel = tablerOutlineIcon(
            name = "Trowel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.42 9.058 9.058 14.421c-.485 .485-1.186 .684-1.853 .526C6.538 14.79 6 14.298 5.783 13.648L3.101 5.604C2.864 4.893 3.049 4.11 3.579 3.58c.53-.53 1.313-.715 2.024-.478l8.045 2.682c.65 .217 1.141 .755 1.299 1.422 .157 .667-.041 1.368-.526 1.852")
            addPathData("M10 10l6.5 6.5")
            addPathData("M19.347 16.575l1.08 1.079c.765 .766 .765 2.007-0 2.773-.766 .765-2.007 .765-2.773-0L16.574 19.347c-.765-.766-.765-2.007 0-2.773 .766-.765 2.007-.765 2.773 .001")
        }
        return _trowel!!
    }

private var _trowel: ImageVector? = null

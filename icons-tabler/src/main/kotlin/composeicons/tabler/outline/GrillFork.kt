package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GrillFork: ImageVector
    get() {
        if (_grillFork != null) return _grillFork!!
        _grillFork = tablerOutlineIcon(
            name = "GrillFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5 16.5 16.5")
            addPathData("M19.347 16.575l1.08 1.079c.765 .766 .765 2.007-0 2.773-.766 .765-2.007 .765-2.773-0L16.574 19.347c-.765-.766-.765-2.007 0-2.773 .766-.765 2.007-.765 2.773 .001")
            addPathData("M3 7l3.05 3.15c1.14 1.086 2.938 1.064 4.051-.049 1.113-1.113 1.135-2.911 .049-4.051L7 3")
        }
        return _grillFork!!
    }

private var _grillFork: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = tablerOutlineIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 14c.83 .642 2.077 1.017 3.5 1 1.423 .017 2.67-.358 3.5-1 .83-.642 2.077-1.017 3.5-1 1.423-.017 2.67 .358 3.5 1")
            addPathData("M8 3C7.357 3.461 6.983 4.209 7 5c-.017 .791 .357 1.539 1 2")
            addPathData("M12 3c-.643 .461-1.017 1.209-1 2-.017 .791 .357 1.539 1 2")
            addPathData("M3 10h14v5c0 3.314-2.686 6-6 6h-2C5.686 21 3 18.314 3 15v-5")
            addPathData("M16.746 16.726c1.229 .564 2.683 .236 3.551-.8 .868-1.037 .936-2.526 .165-3.637-.771-1.111-2.19-1.569-3.464-1.118")
        }
        return _coffee!!
    }

private var _coffee: ImageVector? = null

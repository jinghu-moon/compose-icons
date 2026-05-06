package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = tablerOutlineIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 20h18v-8C21 10.343 19.657 9 18 9h-12C4.343 9 3 10.343 3 12v8")
            addPathData("M3 14.803c.312 .135 .654 .204 1 .197 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .35 .007 .692-.062 1-.197")
            addPathData("M12 4l1.465 1.638c.728 .783 .712 1.999-.036 2.762-.748 .763-1.964 .803-2.761 .091C9.871 7.779 9.775 6.566 10.45 5.737L12 4")
        }
        return _cake!!
    }

private var _cake: ImageVector? = null

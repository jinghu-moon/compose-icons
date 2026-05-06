package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PoolOff: ImageVector
    get() {
        if (_poolOff != null) return _poolOff!!
        _poolOff = tablerOutlineIcon(
            name = "PoolOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 20c.461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .303 0 .6-.045 .876-.146")
            addPathData("M2 16c.461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .282-.393 .676-.691 1.13-.856M20.857 16.861c.46-.164 .858-.464 1.143-.861")
            addPathData("M15 11v-6.5C15 3.672 15.672 3 16.5 3 17.328 3 18 3.672 18 4.5")
            addPathData("M9 12v-3M9 5v-.5C9 4.025 8.775 3.578 8.394 3.294 8.012 3.011 7.519 2.926 7.064 3.064")
            addPathData("M15 5h-6")
            addPathData("M9 10h1M14 10h1")
            addPathData("M3 3 21 21")
        }
        return _poolOff!!
    }

private var _poolOff: ImageVector? = null

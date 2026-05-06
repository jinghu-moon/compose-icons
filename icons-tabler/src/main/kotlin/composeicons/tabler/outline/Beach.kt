package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beach: ImageVector
    get() {
        if (_beach != null) return _beach!!
        _beach = tablerOutlineIcon(
            name = "Beach",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.553 16.75c-2.929-2.929-7.677-2.929-10.606 0")
            addPathData("M18 3.804C15.13 2.147 11.461 3.13 9.804 6l10.392 6C21.853 9.13 20.87 5.461 18 3.804")
            addPathData("M16.732 10C18.39 7.13 18.957 4.356 18 3.804 17.043 3.252 14.925 5.13 13.268 8")
            addPathData("M15 9l-3 5.196")
            addPathData("M3 19.25c.311-.155 .652-.24 1-.25 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .348 .01 .689 .095 1 .25")
        }
        return _beach!!
    }

private var _beach: ImageVector? = null

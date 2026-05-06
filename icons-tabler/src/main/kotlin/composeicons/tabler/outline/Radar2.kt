package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Radar2: ImageVector
    get() {
        if (_radar2 != null) return _radar2!!
        _radar2 = tablerOutlineIcon(
            name = "Radar2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M15.51 15.56c1.701-1.677 1.978-4.323 .661-6.316C14.854 7.251 12.311 6.468 10.101 7.374 7.891 8.281 6.631 10.624 7.094 12.968 7.556 15.311 9.611 17 12 17")
            addPathData("M18.832 17.86c2.754-3.21 2.901-7.904 .354-11.28C16.639 3.204 12.085 2.056 8.243 3.822 4.4 5.588 2.305 9.792 3.209 13.923 4.113 18.055 7.771 20.999 12 21")
            addPathData("M12 12v9")
        }
        return _radar2!!
    }

private var _radar2: ImageVector? = null

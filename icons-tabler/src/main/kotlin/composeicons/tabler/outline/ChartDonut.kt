package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = tablerOutlineIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3.2C5.67 4.204 2.721 8.218 3.058 12.65c.337 4.432 3.859 7.954 8.291 8.291 4.432 .337 8.446-2.612 9.45-6.942 0-.552-.448-1-1-1h-3.8c-.503 1.933-2.325 3.222-4.315 3.053C9.695 15.884 8.116 14.305 7.947 12.315 7.778 10.325 9.067 8.503 11 8v-4c-.025-.239-.145-.459-.333-.609C10.479 3.241 10.239 3.172 10 3.2")
            addPathData("M15 3.5c2.572 .906 4.594 2.928 5.5 5.5h-4.5c-.307-.359-.641-.693-1-1v-4.5")
        }
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LoaderQuarter: ImageVector
    get() {
        if (_loaderQuarter != null) return _loaderQuarter!!
        _loaderQuarter = tablerOutlineIcon(
            name = "LoaderQuarter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v-3")
            addPathData("M6 12h-3")
            addPathData("M7.75 7.75 5.6 5.6")
        }
        return _loaderQuarter!!
    }

private var _loaderQuarter: ImageVector? = null

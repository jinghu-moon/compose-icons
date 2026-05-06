package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = tablerOutlineIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 14.343 8.657 13 7 13 5.343 13 4 14.343 4 16")
            addPathData("M14 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M16.346 9.17 15.617 7.909C15.457 7.661 14.561 7.706 14.5 8l-.177 1.38")
            addPathData("M19.761 14.813 16.921 9.68C16.732 9.37 16.329 9 15.5 9 14.672 9 14 9.448 14 10v6")
            addPathData("M7.654 9.17 8.383 7.909C8.543 7.66 9.439 7.706 9.5 8l.177 1.38")
            addPathData("M4.239 14.813 7.079 9.68C7.268 9.37 7.671 9 8.5 9 9.328 9 10 9.448 10 10v6")
            addPathData("M10 12h4v2h-4v-2")
        }
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null

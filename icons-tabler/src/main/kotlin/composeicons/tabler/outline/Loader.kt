package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Loader: ImageVector
    get() {
        if (_loader != null) return _loader!!
        _loader = tablerOutlineIcon(
            name = "Loader",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v-3")
            addPathData("M16.25 7.75 18.4 5.6")
            addPathData("M18 12h3")
            addPathData("M16.25 16.25l2.15 2.15")
            addPathData("M12 18v3")
            addPathData("M7.75 16.25 5.6 18.4")
            addPathData("M6 12h-3")
            addPathData("M7.75 7.75 5.6 5.6")
        }
        return _loader!!
    }

private var _loader: ImageVector? = null

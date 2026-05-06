package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lighter: ImageVector
    get() {
        if (_lighter != null) return _lighter!!
        _lighter = tablerOutlineIcon(
            name = "Lighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3v16c0 1.105 .895 2 2 2h5c1.105 0 2-.895 2-2v-7h-12C5.895 12 5 11.105 5 10v-5C5 3.895 5.895 3 7 3h3")
            addPathData("M16 4l1.465 1.638c.728 .783 .712 1.999-.036 2.762-.748 .763-1.964 .803-2.761 .091-.797-.712-.893-1.925-.217-2.754L16 4")
        }
        return _lighter!!
    }

private var _lighter: ImageVector? = null

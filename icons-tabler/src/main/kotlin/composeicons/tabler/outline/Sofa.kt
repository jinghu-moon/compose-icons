package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sofa: ImageVector
    get() {
        if (_sofa != null) return _sofa!!
        _sofa = tablerOutlineIcon(
            name = "Sofa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11c1.105 0 2 .895 2 2v1h12v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v5c0 .552-.448 1-1 1h-18C2.448 19 2 18.552 2 18v-5c0-1.105 .895-2 2-2")
            addPathData("M4 11v-3C4 6.343 5.343 5 7 5h10c1.657 0 3 1.343 3 3v3")
            addPathData("M12 5v9")
        }
        return _sofa!!
    }

private var _sofa: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Vocabulary: ImageVector
    get() {
        if (_vocabulary != null) return _vocabulary!!
        _vocabulary = tablerOutlineIcon(
            name = "Vocabulary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 19h-6C3.448 19 3 18.552 3 18v-14C3 3.448 3.448 3 4 3h6c1.105 0 2 .895 2 2 0-1.105 .895-2 2-2h6c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-6c-1.105 0-2 .895-2 2 0-1.105-.895-2-2-2")
            addPathData("M12 5v16")
            addPathData("M7 7h1")
            addPathData("M7 11h1")
            addPathData("M16 7h1")
            addPathData("M16 11h1")
            addPathData("M16 15h1")
        }
        return _vocabulary!!
    }

private var _vocabulary: ImageVector? = null

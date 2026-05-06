package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Analyze: ImageVector
    get() {
        if (_analyze != null) return _analyze!!
        _analyze = tablerOutlineIcon(
            name = "Analyze",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11C19.497 7.383 16.636 4.549 13.014 4.082 9.797 3.663 6.642 5.205 4.995 8")
            addPathData("M4 13c.474 3.413 3.056 6.152 6.434 6.828C13.813 20.504 17.25 18.968 19 16")
            addPathData("M18 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M4 8c0 .552 .448 1 1 1C5.552 9 6 8.552 6 8 6 7.448 5.552 7 5 7 4.448 7 4 7.448 4 8")
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
        }
        return _analyze!!
    }

private var _analyze: ImageVector? = null

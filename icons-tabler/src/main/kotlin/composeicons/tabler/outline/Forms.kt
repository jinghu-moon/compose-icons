package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Forms: ImageVector
    get() {
        if (_forms != null) return _forms!!
        _forms = tablerOutlineIcon(
            name = "Forms",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3C10.343 3 9 4.343 9 6v12c0 1.657 1.343 3 3 3")
            addPathData("M6 3C7.657 3 9 4.343 9 6v12c0 1.657-1.343 3-3 3")
            addPathData("M13 7h7c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-7")
            addPathData("M5 7h-1C3.448 7 3 7.448 3 8v8c0 .552 .448 1 1 1h1")
            addPathData("M17 12h.01")
            addPathData("M13 12h.01")
        }
        return _forms!!
    }

private var _forms: ImageVector? = null

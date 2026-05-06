package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = tablerOutlineIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3h6")
            addPathData("M10 9h4")
            addPathData("M10 3v6L6 20c-.098 .197-.098 .428 .001 .625 .098 .197 .283 .336 .499 .375h11c.216-.04 .401-.179 .499-.375 .098-.197 .099-.428 .001-.625L14 9v-6")
        }
        return _flask!!
    }

private var _flask: ImageVector? = null

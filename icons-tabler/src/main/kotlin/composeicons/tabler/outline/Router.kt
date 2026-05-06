package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Router: ImageVector
    get() {
        if (_router != null) return _router!!
        _router = tablerOutlineIcon(
            name = "Router",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15c0-1.105 .895-2 2-2h14c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-4")
            addPathData("M17 17v.01")
            addPathData("M13 17v.01")
            addPathData("M15 13v-2")
            addPathData("M11.75 8.75C12.501 7.703 13.711 7.082 15 7.082c1.289 0 2.499 .621 3.25 1.668")
            addPathData("M8.5 6.5C10.003 4.406 12.422 3.164 15 3.164c2.578 0 4.997 1.242 6.5 3.336")
        }
        return _router!!
    }

private var _router: ImageVector? = null

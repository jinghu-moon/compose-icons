package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mesh: ImageVector
    get() {
        if (_mesh != null) return _mesh!!
        _mesh = tablerOutlineIcon(
            name = "Mesh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9h18")
            addPathData("M3 15h18")
            addPathData("M8 4c.485 .445 3.5 3.312 3.5 8 0 .663-.07 4.848-3.5 8")
            addPathData("M15 4c1.315 2.462 2.003 5.209 2.004 8 0 1.51-.201 4.628-2.004 8")
            addPathData("M18.778 20h-13.556c-.589 .001-1.155-.233-1.572-.65C3.233 18.933 2.999 18.367 3 17.778v-11.556C3 4.995 3.995 4 5.222 4h13.556C20.005 4 21 4.995 21 6.222v11.556c.001 .589-.233 1.155-.65 1.572-.417 .417-.982 .651-1.572 .65")
        }
        return _mesh!!
    }

private var _mesh: ImageVector? = null

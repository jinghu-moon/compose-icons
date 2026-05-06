package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = tablerOutlineIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v.01")
            addPathData("M19.071 4.929C17.509 3.367 13.071 5.266 9.171 9.172 5.266 13.077 3.367 17.509 4.929 19.072c1.562 1.561 6-.338 9.9-4.244 3.905-3.905 5.804-8.337 4.242-9.9")
            addPathData("M4.929 4.929c-1.562 1.562 .337 6 4.243 9.9 3.905 3.905 8.337 5.804 9.9 4.242 1.561-1.562-.338-6-4.244-9.9C10.923 5.266 6.491 3.367 4.928 4.929")
        }
        return _atom!!
    }

private var _atom: ImageVector? = null

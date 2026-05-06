package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreativeCommonsNc: ImageVector
    get() {
        if (_creativeCommonsNc != null) return _creativeCommonsNc!!
        _creativeCommonsNc = tablerOutlineIcon(
            name = "CreativeCommonsNc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M15 9h-4.5C9.672 9 9 9.672 9 10.5 9 11.328 9.672 12 10.5 12h3c.828 0 1.5 .672 1.5 1.5C15 14.328 14.328 15 13.5 15h-4.5")
            addPathData("M12 7v2")
            addPathData("M12 15v2")
            addPathData("M6 6 9 9")
            addPathData("M15 15l3 3")
        }
        return _creativeCommonsNc!!
    }

private var _creativeCommonsNc: ImageVector? = null

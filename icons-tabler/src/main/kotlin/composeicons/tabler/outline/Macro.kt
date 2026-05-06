package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Macro: ImageVector
    get() {
        if (_macro != null) return _macro!!
        _macro = tablerOutlineIcon(
            name = "Macro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 15c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6")
            addPathData("M18 15c-3.314 0-6 2.686-6 6")
            addPathData("M12 21C12 17.686 9.314 15 6 15")
            addPathData("M12 21v-10")
            addPathData("M12 11C9.239 11 7 8.761 7 6v-3l3 2L12 3l2 2L17 3v3c0 2.761-2.239 5-5 5")
        }
        return _macro!!
    }

private var _macro: ImageVector? = null

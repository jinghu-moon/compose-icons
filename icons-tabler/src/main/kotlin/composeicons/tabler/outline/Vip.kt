package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Vip: ImageVector
    get() {
        if (_vip != null) return _vip!!
        _vip = tablerOutlineIcon(
            name = "Vip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h18")
            addPathData("M3 19h18")
            addPathData("M4 9l2 6h1L9 9")
            addPathData("M12 9v6")
            addPathData("M16 15v-6h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
        }
        return _vip!!
    }

private var _vip: ImageVector? = null

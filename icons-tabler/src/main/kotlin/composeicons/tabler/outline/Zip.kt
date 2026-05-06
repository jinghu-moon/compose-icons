package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Zip: ImageVector
    get() {
        if (_zip != null) return _zip!!
        _zip = tablerOutlineIcon(
            name = "Zip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 16v-8h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
            addPathData("M12 8v8")
            addPathData("M4 8h4L4 16h4")
        }
        return _zip!!
    }

private var _zip: ImageVector? = null

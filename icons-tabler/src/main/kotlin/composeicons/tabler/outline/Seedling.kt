package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Seedling: ImageVector
    get() {
        if (_seedling != null) return _seedling!!
        _seedling = tablerOutlineIcon(
            name = "Seedling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10C12 6.686 9.314 4 6 4h-3v2c0 3.314 2.686 6 6 6h3")
            addPathData("M12 14c0-3.314 2.686-6 6-6h3v1c0 3.314-2.686 6-6 6h-3")
            addPathData("M12 20v-10")
        }
        return _seedling!!
    }

private var _seedling: ImageVector? = null

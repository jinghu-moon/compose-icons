package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Packages: ImageVector
    get() {
        if (_packages != null) return _packages!!
        _packages = tablerOutlineIcon(
            name = "Packages",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 16.5l-5-3 5-3 5 3v5.5L7 22v-5.5")
            addPathData("M2 13.5v5.5l5 3")
            addPathData("M7 16.545l5-3.03")
            addPathData("M17 16.5l-5-3 5-3 5 3v5.5l-5 3v-5.5")
            addPathData("M12 19l5 3")
            addPathData("M17 16.5l5-3")
            addPathData("M12 13.5v-5.5L7 5 12 2l5 3v5.5")
            addPathData("M7 5.03v5.455")
            addPathData("M12 8 17 5")
        }
        return _packages!!
    }

private var _packages: ImageVector? = null

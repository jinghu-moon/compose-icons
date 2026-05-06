package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Credits: ImageVector
    get() {
        if (_credits != null) return _credits!!
        _credits = tablerOutlineIcon(
            name = "Credits",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 14c0 1.105 2.686 2 6 2 3.314 0 6-.895 6-2C15 12.895 12.314 12 9 12c-3.314 0-6 .895-6 2")
            addPathData("M3 14v5c0 1.105 2.686 2 6 2 3.314 0 6-.895 6-2v-5")
            addPathData("M9 5c0 1.105 2.686 2 6 2 3.314 0 6-.895 6-2C21 3.895 18.314 3 15 3 11.686 3 9 3.895 9 5")
            addPathData("M9 5v3")
            addPathData("M18.365 11.656C19.955 11.296 21 10.69 21 10v-5")
        }
        return _credits!!
    }

private var _credits: ImageVector? = null

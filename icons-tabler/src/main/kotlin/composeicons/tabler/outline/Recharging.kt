package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Recharging: ImageVector
    get() {
        if (_recharging != null) return _recharging!!
        _recharging = tablerOutlineIcon(
            name = "Recharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.038 4.5C6.052 5.152 5.204 5.991 4.543 6.97")
            addPathData("M3.186 10.209c-.23 1.158-.23 2.35 0 3.508")
            addPathData("M4.5 16.962c.652 .986 1.491 1.834 2.47 2.495")
            addPathData("M10.209 20.814c1.155 .229 2.345 .229 3.5 0")
            addPathData("M16.962 19.5c.986-.652 1.834-1.491 2.495-2.47")
            addPathData("M20.814 13.791c.23-1.158 .23-2.35 0-3.508")
            addPathData("M19.5 7.038C18.848 6.052 18.009 5.204 17.03 4.543")
            addPathData("M13.791 3.186C12.634 2.949 11.442 2.943 10.283 3.166")
            addPathData("M12 8l-2 4h4l-2 4")
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3")
        }
        return _recharging!!
    }

private var _recharging: ImageVector? = null

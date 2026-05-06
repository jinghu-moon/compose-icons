package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZeppelinOff: ImageVector
    get() {
        if (_zeppelinOff != null) return _zeppelinOff!!
        _zeppelinOff = tablerOutlineIcon(
            name = "ZeppelinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.773 15.783c-.723 .141-1.486 .217-2.273 .217C11.37 16 8.916 15.074 6.136 13.223L4 15v-3.33C3.318 11.132 2.651 10.575 2 10 2.651 9.425 3.318 8.868 4 8.33v-3.33L6.135 6.778c.13-.087 .261-.172 .39-.256M9.089 5.102C10.69 4.367 12.16 4 13.5 4 18.194 4 22 6.686 22 10c0 1.919-1.276 3.627-3.261 4.725")
            addPathData("M10 15.5v4.5h6v-4")
            addPathData("M3 3 21 21")
        }
        return _zeppelinOff!!
    }

private var _zeppelinOff: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OctagonOff: ImageVector
    get() {
        if (_octagonOff != null) return _octagonOff!!
        _octagonOff = tablerOutlineIcon(
            name = "OctagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.027 19.002c-.186 .189-.406 .34-.65 .444l-5.575 2.39c-.512 .219-1.092 .219-1.604 0L5.623 19.446c-.481-.206-.864-.589-1.07-1.07L2.165 12.802c-.219-.512-.219-1.092 0-1.604L4.554 5.623c.103-.24 .25-.457 .433-.639M7.676 3.674 11.198 2.164c.512-.219 1.092-.219 1.604 0l5.575 2.39c.48 .206 .863 .589 1.07 1.07l2.388 5.574c.22 .512 .22 1.092 0 1.604l-1.509 3.522")
            addPathData("M3 3 21 21")
        }
        return _octagonOff!!
    }

private var _octagonOff: ImageVector? = null

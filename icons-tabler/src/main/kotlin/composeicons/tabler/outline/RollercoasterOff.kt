package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RollercoasterOff: ImageVector
    get() {
        if (_rollercoasterOff != null) return _rollercoasterOff!!
        _rollercoasterOff = tablerOutlineIcon(
            name = "RollercoasterOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21c2.389-0 4.51-1.529 5.265-3.795L9 15c.464-1.395 1.273-2.651 2.35-3.652M13.753 9.759C14.877 9.258 16.094 8.999 17.325 9h3.675")
            addPathData("M20 9v7M20 20v1")
            addPathData("M8 21v-3")
            addPathData("M12 21v-9")
            addPathData("M16 9.5v2.5M16 16v5")
            addPathData("M15 3h5v3h-5v-3")
            addPathData("M9.446 5.415 10 5l2 2.5-.285 .213M9.447 9.415 8 10.5 6.2 10 6 8 7.139 7.146")
            addPathData("M3 3 21 21")
        }
        return _rollercoasterOff!!
    }

private var _rollercoasterOff: ImageVector? = null

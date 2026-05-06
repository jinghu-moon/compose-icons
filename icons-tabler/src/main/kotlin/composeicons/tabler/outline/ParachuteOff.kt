package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ParachuteOff: ImageVector
    get() {
        if (_parachuteOff != null) return _parachuteOff!!
        _parachuteOff = tablerOutlineIcon(
            name = "ParachuteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12C22 6.477 17.523 2 12 2 10.263 2 8.63 2.443 7.206 3.222M4.926 4.932C3.05 6.805 1.997 9.349 2 12")
            addPathData("M22 12C22 10.34 20.54 9 18.75 9c-1.63 0-2.973 1.099-3.212 2.54M15.441 11.45C15.211 10.383 14.321 9.515 13.151 9.166M9.706 9.734C8.967 10.284 8.5 11.094 8.5 12 8.5 10.34 7.04 9 5.25 9 3.45 9 2 10.34 2 12")
            addPathData("M2 12 12 22 8.5 12")
            addPathData("M14.582 14.624 12 22l4.992-4.992M19.006 14.994l3-3")
            addPathData("M3 3 21 21")
        }
        return _parachuteOff!!
    }

private var _parachuteOff: ImageVector? = null

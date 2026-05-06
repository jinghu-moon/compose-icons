package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArchiveOff: ImageVector
    get() {
        if (_archiveOff != null) return _archiveOff!!
        _archiveOff = tablerOutlineIcon(
            name = "ArchiveOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h11c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-7M8 8h-3C4.058 8.001 3.243 7.343 3.044 6.422 2.845 5.502 3.316 4.567 4.174 4.178")
            addPathData("M5 8v10c0 1.105 .895 2 2 2h10c.787-0 1.501-.462 1.824-1.18M19 15v-7")
            addPathData("M10 12h2")
            addPathData("M3 3 21 21")
        }
        return _archiveOff!!
    }

private var _archiveOff: ImageVector? = null

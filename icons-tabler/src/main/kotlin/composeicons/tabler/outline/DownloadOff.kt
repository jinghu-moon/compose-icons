package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DownloadOff: ImageVector
    get() {
        if (_downloadOff != null) return _downloadOff!!
        _downloadOff = tablerOutlineIcon(
            name = "DownloadOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17v2c0 1.105 .895 2 2 2h12c.792 .001 1.509-.466 1.83-1.19")
            addPathData("M7 11l5 5 2-2M16 12l1-1")
            addPathData("M12 4v4M12 12v4")
            addPathData("M3 3 21 21")
        }
        return _downloadOff!!
    }

private var _downloadOff: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ServerSpark: ImageVector
    get() {
        if (_serverSpark != null) return _serverSpark!!
        _serverSpark = tablerOutlineIcon(
            name = "ServerSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
            addPathData("M3 7C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-12C4.343 12 3 10.657 3 9v-2")
            addPathData("M12 20h-6C4.343 20 3 18.657 3 17v-2C3 13.343 4.343 12 6 12h10.5")
            addPathData("M7 8v.01")
            addPathData("M7 16v.01")
        }
        return _serverSpark!!
    }

private var _serverSpark: ImageVector? = null

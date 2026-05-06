package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArtboardOff: ImageVector
    get() {
        if (_artboardOff != null) return _artboardOff!!
        _artboardOff = tablerOutlineIcon(
            name = "ArtboardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8h3c.552 0 1 .448 1 1v3")
            addPathData("M15.716 15.698c-.188 .193-.446 .302-.716 .302h-6C8.448 16 8 15.552 8 15v-6c0-.273 .11-.52 .287-.7")
            addPathData("M3 8h1")
            addPathData("M3 16h1")
            addPathData("M8 3v1")
            addPathData("M16 3v1")
            addPathData("M20 8h1")
            addPathData("M20 16h1")
            addPathData("M8 20v1")
            addPathData("M16 20v1")
            addPathData("M3 3 21 21")
        }
        return _artboardOff!!
    }

private var _artboardOff: ImageVector? = null

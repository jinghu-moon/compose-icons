package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = tablerFilledIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-3v12c-0 1.81-1.216 3.395-2.965 3.863-1.749 .469-3.594-.296-4.499-1.863-.905-1.568-.645-3.548 .635-4.828 1.28-1.28 3.26-1.541 4.828-.637L16 4c0-.552 .448-1 1-1Z")
            addPathData("M14 5c0 .552-.448 1-1 1h-10C2.448 6 2 5.552 2 5 2 4.448 2.448 4 3 4h10c.552 0 1 .448 1 1")
            addPathData("M14 9c0 .552-.448 1-1 1h-10C2.448 10 2 9.552 2 9 2 8.448 2.448 8 3 8h10c.552 0 1 .448 1 1")
            addPathData("M10 13c0 .552-.448 1-1 1h-6C2.448 14 2 13.552 2 13c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1")
        }
        return _playlist!!
    }

private var _playlist: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Galaxy: ImageVector
    get() {
        if (_galaxy != null) return _galaxy!!
        _galaxy = tablerOutlineIcon(
            name = "Galaxy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3C10.667 4 10 5.5 10 7.5c0 3 2 4.5 2 4.5 0 0 2 1.5 2 4.5 0 2-.667 3.5-2 4.5")
            addPathData("M19.794 16.5c-.2-1.655-1.165-2.982-2.897-3.982C14.3 11.018 12 12 12 12c0 0-2.299 .982-4.897-.518C5.371 10.482 4.405 9.155 4.206 7.5")
            addPathData("M19.794 7.5c-1.532-.655-3.165-.482-4.897 .518C12.3 9.518 12 12 12 12c0 0-.299 2.482-2.897 3.982-1.732 1-3.365 1.173-4.897 .518")
        }
        return _galaxy!!
    }

private var _galaxy: ImageVector? = null

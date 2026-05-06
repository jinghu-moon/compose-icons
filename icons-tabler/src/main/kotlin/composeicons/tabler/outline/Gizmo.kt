package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Gizmo: ImageVector
    get() {
        if (_gizmo != null) return _gizmo!!
        _gizmo = tablerOutlineIcon(
            name = "Gizmo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 19 12 13.5 4 19")
            addPathData("M12 4v9.5")
            addPathData("M11 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 3.448 12.552 3 12 3c-.552 0-1 .448-1 1")
            addPathData("M3 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1C5 18.448 4.552 18 4 18c-.552 0-1 .448-1 1")
            addPathData("M19 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _gizmo!!
    }

private var _gizmo: ImageVector? = null

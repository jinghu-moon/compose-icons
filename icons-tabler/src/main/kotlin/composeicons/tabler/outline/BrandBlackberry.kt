package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBlackberry: ImageVector
    get() {
        if (_brandBlackberry != null) return _brandBlackberry!!
        _brandBlackberry = tablerOutlineIcon(
            name = "BrandBlackberry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 6C7 5.448 6.552 5 6 5h-2L3.5 7h2.5C6.552 7 7 6.552 7 6")
            addPathData("M6 12C6 11.448 5.552 11 5 11h-2l-.5 2h2.5c.552 0 1-.448 1-1")
            addPathData("M13 12c0-.552-.448-1-1-1h-2l-.5 2h2.5c.552 0 1-.448 1-1")
            addPathData("M14 6C14 5.448 13.552 5 13 5h-2l-.5 2h2.5c.552 0 1-.448 1-1")
            addPathData("M12 18c0-.552-.448-1-1-1h-2l-.5 2h2.5c.552 0 1-.448 1-1")
            addPathData("M20 15c0-.552-.448-1-1-1h-2l-.5 2h2.5c.552 0 1-.448 1-1")
            addPathData("M21 9C21 8.448 20.552 8 20 8h-2l-.5 2h2.5c.552 0 1-.448 1-1")
        }
        return _brandBlackberry!!
    }

private var _brandBlackberry: ImageVector? = null

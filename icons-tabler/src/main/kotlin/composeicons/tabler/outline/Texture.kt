package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Texture: ImageVector
    get() {
        if (_texture != null) return _texture!!
        _texture = tablerOutlineIcon(
            name = "Texture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3 3 6")
            addPathData("M21 18l-3 3")
            addPathData("M11 3 3 11")
            addPathData("M16 3 3 16")
            addPathData("M21 3 3 21")
            addPathData("M21 8 8 21")
            addPathData("M21 13l-8 8")
        }
        return _texture!!
    }

private var _texture: ImageVector? = null

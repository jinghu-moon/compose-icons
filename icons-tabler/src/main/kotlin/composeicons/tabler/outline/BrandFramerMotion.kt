package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFramerMotion: ImageVector
    get() {
        if (_brandFramerMotion != null) return _brandFramerMotion!!
        _brandFramerMotion = tablerOutlineIcon(
            name = "BrandFramerMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12 4 4v16L20 4v16L16 16")
            addPathData("M20 12l-8 8L8 16")
        }
        return _brandFramerMotion!!
    }

private var _brandFramerMotion: ImageVector? = null

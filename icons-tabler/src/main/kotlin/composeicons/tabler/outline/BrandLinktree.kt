package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLinktree: ImageVector
    get() {
        if (_brandLinktree != null) return _brandLinktree!!
        _brandLinktree = tablerOutlineIcon(
            name = "BrandLinktree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10h16")
            addPathData("M6.5 4.5l11 11")
            addPathData("M6.5 15.5l11-11")
            addPathData("M12 10v-8")
            addPathData("M12 15v7")
        }
        return _brandLinktree!!
    }

private var _brandLinktree: ImageVector? = null

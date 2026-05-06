package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSuperhuman: ImageVector
    get() {
        if (_brandSuperhuman != null) return _brandSuperhuman!!
        _brandSuperhuman = tablerOutlineIcon(
            name = "BrandSuperhuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12l4 3-8 7L4 15 8 12")
            addPathData("M12 3 4 9l8 6L20 9 12 3")
            addPathData("M12 15h8")
        }
        return _brandSuperhuman!!
    }

private var _brandSuperhuman: ImageVector? = null

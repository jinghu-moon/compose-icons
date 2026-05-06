package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWeibo: ImageVector
    get() {
        if (_brandWeibo != null) return _brandWeibo!!
        _brandWeibo = tablerOutlineIcon(
            name = "BrandWeibo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 14.127C19 17.2 15.498 20 11 20 6.874 20 3 17.776 3 14.435 3 12.655 3.984 10.698 5.7 8.868 8.062 6.358 10.893 5.181 12.251 6.63c.415 .44 .752 1.39 .749 2.062 2-1.615 4.308 .387 3.5 2.693 1.26 .557 2.5 .538 2.5 2.742")
            addPathData("M15 4h1c2.761 0 5 2.239 5 5v1")
        }
        return _brandWeibo!!
    }

private var _brandWeibo: ImageVector? = null

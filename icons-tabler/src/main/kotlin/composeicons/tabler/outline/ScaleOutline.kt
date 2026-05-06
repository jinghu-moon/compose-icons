package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScaleOutline: ImageVector
    get() {
        if (_scaleOutline != null) return _scaleOutline!!
        _scaleOutline = tablerOutlineIcon(
            name = "ScaleOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 4.791 4.791 3 7 3h10c2.209 0 4 1.791 4 4v10c0 2.209-1.791 4-4 4h-10C4.791 21 3 19.209 3 17v-10")
            addPathData("M12 7c1.956 0 3.724 .802 5 2.095l-2.956 2.904c-.554-.514-1.282-.799-2.038-.799-.756-0-1.483 .285-2.038 .798L7.012 9.095C8.328 7.751 10.131 6.996 12.012 7")
        }
        return _scaleOutline!!
    }

private var _scaleOutline: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandXamarin: ImageVector
    get() {
        if (_brandXamarin != null) return _brandXamarin!!
        _brandXamarin = tablerOutlineIcon(
            name = "BrandXamarin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.958 21h-7.917C7.326 21 6.666 20.619 6.309 20L2.268 13c-.357-.619-.357-1.381 0-2L6.309 4C6.666 3.381 7.326 3 8.041 3h7.917c.715 0 1.375 .381 1.732 1l4.042 7c.357 .619 .357 1.381 0 2l-4.041 7c-.357 .619-1.018 1-1.733 1")
            addPathData("M15 16 9 8")
            addPathData("M9 16 15 8")
        }
        return _brandXamarin!!
    }

private var _brandXamarin: ImageVector? = null

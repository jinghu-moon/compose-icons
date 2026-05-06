package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ImageMinus: ImageVector
    get() {
        if (_imageMinus != null) return _imageMinus!!
        _imageMinus = lucideOutlineIcon(
            name = "ImageMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 9v10c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h7")
            addPathData("M16 5h6")
            addPathData("M11 9c0 1.105-.895 2-2 2C7.895 11 7 10.105 7 9 7 7.895 7.895 7 9 7c1.105 0 2 .895 2 2Z")
            addPathData("M21 15 17.914 11.914c-.781-.781-2.047-.781-2.828 0L6 21")
        }
        return _imageMinus!!
    }

private var _imageMinus: ImageVector? = null

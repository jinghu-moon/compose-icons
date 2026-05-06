package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPlus: ImageVector
    get() {
        if (_mapPlus != null) return _mapPlus!!
        _mapPlus = lucideOutlineIcon(
            name = "MapPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 19 9.894 18.448c-.563-.281-1.225-.281-1.788 0L4.447 20.278c-.31 .155-.679 .138-.974-.045C3.178 20.051 2.999 19.728 3 19.381v-12.763c0-.379 .214-.725 .553-.894L8.106 3.447c.563-.281 1.225-.281 1.788 0l4.212 2.106c.563 .281 1.225 .281 1.788 0L19.553 3.723c.31-.155 .679-.138 .973 .044 .295 .183 .474 .505 .474 .852v7.381")
            addPathData("M15 5.764v6.236")
            addPathData("M18 15v6")
            addPathData("M21 18h-6")
            addPathData("M9 3.236v15")
        }
        return _mapPlus!!
    }

private var _mapPlus: ImageVector? = null

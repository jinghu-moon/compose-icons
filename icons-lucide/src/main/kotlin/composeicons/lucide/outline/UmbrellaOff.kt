package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UmbrellaOff: ImageVector
    get() {
        if (_umbrellaOff != null) return _umbrellaOff!!
        _umbrellaOff = lucideOutlineIcon(
            name = "UmbrellaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M12 2v2")
            addPathData("M18.656 13h2.336c.315 .003 .613-.143 .804-.394 .191-.251 .252-.577 .166-.88C20.595 6.397 15.276 3.088 9.892 4.216")
            addPathData("M2 2 22 22")
            addPathData("M5.961 5.957C4.021 7.364 2.634 9.405 2.039 11.726c-.086 .302-.025 .626 .163 .876 .189 .25 .484 .398 .798 .398h10")
        }
        return _umbrellaOff!!
    }

private var _umbrellaOff: ImageVector? = null

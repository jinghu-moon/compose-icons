package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Telescope: ImageVector
    get() {
        if (_telescope != null) return _telescope!!
        _telescope = lucideOutlineIcon(
            name = "Telescope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.065 12.493 3.885 13.811c-.499 .108-.993-.204-1.108-.702L2.24 10.959c-.131-.537 .169-1.085 .691-1.265L16.435 5.254")
            addPathData("M13.56 11.747l4.332-.924")
            addPathData("M16 21 12.895 14.79")
            addPathData("M16.485 5.94c-.268-1.071 .384-2.157 1.455-2.425l1.09-.272c.535-.134 1.078 .192 1.212 .727l1.515 6.06c.134 .536-.191 1.079-.727 1.213l-1.09 .272c-1.071 .268-2.157-.384-2.425-1.455Z")
            addPathData("M6.158 8.633l1.114 4.456")
            addPathData("M8 21l3.105-6.21")
            addPathData("M14 13c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _telescope!!
    }

private var _telescope: ImageVector? = null

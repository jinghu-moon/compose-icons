package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NutOff: ImageVector
    get() {
        if (_nutOff != null) return _nutOff!!
        _nutOff = lucideOutlineIcon(
            name = "NutOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4v-2")
            addPathData("M5 10v4c0 3.203 2.173 5.997 5.277 6.787 .412 .104 .802 .292 1.102 .592L12 22l.621-.621c.3-.3 .69-.488 1.102-.592 1.693-.431 3.164-1.479 4.125-2.939")
            addPathData("M19 10v3.343")
            addPathData("M12 12C10.651 11.427 10.095 10.995 9.5 10 8.954 10.902 8.452 11.353 7 12 5.982 11.356 5.54 10.92 5 10c-1.028 .71-1.69 .918-3 1C3.081 9.952 3.757 8.97 4 8 4.194 7.224 4.84 6.449 5.79 5.79M17.444 11.787C18.331 11.33 18.724 10.896 19 10c1.032 .916 1.683 1.157 3 1C20.703 9.964 20.242 8.97 20 8 19.5 6 16 4 12 4c-.74 0-1.461 .068-2.15 .192")
            addPathData("M2 2 22 22")
        }
        return _nutOff!!
    }

private var _nutOff: ImageVector? = null

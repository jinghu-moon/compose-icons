package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) return _eyeOff!!
        _eyeOff = lucideOutlineIcon(
            name = "EyeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.733 5.076c4.787-.57 9.368 2.118 11.205 6.575 .083 .225 .083 .471 0 .696-.368 .891-.853 1.729-1.444 2.49")
            addPathData("M14.084 14.158c-1.177 1.137-3.048 1.121-4.205-.037C8.721 12.964 8.705 11.093 9.842 9.916")
            addPathData("M17.479 17.499c-2.684 1.59-5.926 1.935-8.885 .947C5.635 17.457 3.251 15.232 2.062 12.348c-.083-.225-.083-.471 0-.696C2.949 9.502 4.509 7.697 6.508 6.509")
            addPathData("M2 2 22 22")
        }
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null

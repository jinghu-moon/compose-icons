package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IdCardLanyard: ImageVector
    get() {
        if (_idCardLanyard != null) return _idCardLanyard!!
        _idCardLanyard = lucideOutlineIcon(
            name = "IdCardLanyard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 8h-3")
            addPathData("M15 2 14 4h3c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-10C5.895 22 5 21.105 5 20v-14C5 4.895 5.895 4 7 4h3")
            addPathData("M16.899 22c-.474-2.329-2.523-4.003-4.899-4.003C9.623 17.997 7.574 19.671 7.1 22")
            addPathData("M9 2l3 6")
            addPathData("M15 15c0 1.657-1.343 3-3 3C10.343 18 9 16.657 9 15c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _idCardLanyard!!
    }

private var _idCardLanyard: ImageVector? = null

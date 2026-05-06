package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CannabisOff: ImageVector
    get() {
        if (_cannabisOff != null) return _cannabisOff!!
        _cannabisOff = lucideOutlineIcon(
            name = "CannabisOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-4c1.5 1.5 3.5 3 6 3 0-1.5-.5-3.5-2-5")
            addPathData("M13.988 8.327C13.902 6.054 13.365 3.82 12 2c-.648 .875-1.137 1.856-1.445 2.9")
            addPathData("M17.375 11.725C18.882 10.53 21 7.841 21 6 18.676 6 15.92 7.296 14.338 8.684")
            addPathData("M2 2 22 22")
            addPathData("M21.024 15.378c.33-.115 .655-.241 .976-.378-.426-1.279-2.67-2.557-4.25-2.907")
            addPathData("M6.995 6.992C5.714 6.4 4.29 6 3 6c0 2 2.5 5 4 6C5.5 12 2.5 13.5 2 15c3.5 1.5 6 1 6 1C6.5 17.5 6 19.5 6 21c2.5 0 4.5-1.5 6-3")
        }
        return _cannabisOff!!
    }

private var _cannabisOff: ImageVector? = null

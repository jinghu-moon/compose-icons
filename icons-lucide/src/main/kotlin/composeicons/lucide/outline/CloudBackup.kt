package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudBackup: ImageVector
    get() {
        if (_cloudBackup != null) return _cloudBackup!!
        _cloudBackup = lucideOutlineIcon(
            name = "CloudBackup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 15.251c1.043-1.349 1.233-3.172 .492-4.708C20.75 9.008 19.205 8.023 17.5 8h-1.79C14.932 5.405 12.727 3.491 10.048 3.087 7.369 2.683 4.697 3.862 3.189 6.113 1.681 8.364 1.607 11.283 3 13.607")
            addPathData("M7 11v4h4")
            addPathData("M8 19c1.291 1.722 3.539 2.424 5.581 1.743C15.623 20.063 17 18.152 17 16c0-2.485-2.015-4.5-4.5-4.5-1.279-.001-2.505 .506-3.41 1.41L7 15")
        }
        return _cloudBackup!!
    }

private var _cloudBackup: ImageVector? = null

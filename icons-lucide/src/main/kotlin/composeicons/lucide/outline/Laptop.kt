package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = lucideOutlineIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 5c1.105 0 2 .895 2 2v8.526c-0 .311 .072 .619 .212 .897l1.068 2.127c.157 .311 .14 .681-.043 .977-.184 .296-.508 .475-.857 .473h-16.76c-.348 .002-.673-.177-.857-.473-.184-.296-.2-.666-.043-.977L3.788 16.423c.14-.278 .212-.586 .212-.897v-8.526C4 5.895 4.895 5 6 5Z")
            addPathData("M20.054 15.987h-16.108")
        }
        return _laptop!!
    }

private var _laptop: ImageVector? = null

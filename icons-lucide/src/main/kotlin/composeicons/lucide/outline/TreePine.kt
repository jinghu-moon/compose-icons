package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TreePine: ImageVector
    get() {
        if (_treePine != null) return _treePine!!
        _treePine = lucideOutlineIcon(
            name = "TreePine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 14l3 3.3c.28 .286 .363 .711 .211 1.081-.152 .37-.511 .614-.911 .619h-14.6c-.4-.006-.758-.249-.911-.619C3.637 18.011 3.72 17.586 4 17.3L7 14h-.3c-.4-.006-.758-.249-.911-.619C5.637 13.011 5.72 12.586 6 12.3L9 9h-.2c-.418 .038-.816-.19-.995-.57C7.626 8.05 7.704 7.598 8 7.3L12 3l4 4.3c.296 .298 .374 .75 .195 1.13-.179 .38-.576 .608-.995 .57h-.2l3 3.3c.28 .286 .363 .711 .211 1.081-.152 .37-.511 .614-.911 .619h-.3Z")
            addPathData("M12 22v-3")
        }
        return _treePine!!
    }

private var _treePine: ImageVector? = null

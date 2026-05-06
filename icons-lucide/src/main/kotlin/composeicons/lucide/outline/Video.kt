package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = lucideOutlineIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 13l5.223 3.482c.153 .102 .351 .112 .513 .025 .162-.087 .264-.256 .264-.441v-8.196c0-.179-.096-.345-.251-.434-.155-.089-.346-.089-.501 .002L16 10.5")
            addPathData("M4 6h10c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-10C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6Z")
        }
        return _video!!
    }

private var _video: ImageVector? = null

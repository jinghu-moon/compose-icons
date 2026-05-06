package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Videotape: ImageVector
    get() {
        if (_videotape != null) return _videotape!!
        _videotape = lucideOutlineIcon(
            name = "Videotape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h16c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-12C2 4.895 2.895 4 4 4Z")
            addPathData("M2 8h20")
            addPathData("M10 14c0 1.105-.895 2-2 2C6.895 16 6 15.105 6 14c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M8 12h8")
            addPathData("M18 14c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _videotape!!
    }

private var _videotape: ImageVector? = null

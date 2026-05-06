package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = lucideOutlineIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18v-6C7 9.239 9.239 7 12 7c2.761 0 5 2.239 5 5v6")
            addPathData("M5 21c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-1c0-1.105-.895-2-2-2h-10c-1.105 0-2 .895-2 2Z")
            addPathData("M21 12h1")
            addPathData("M18.5 4.5 18 5")
            addPathData("M2 12h1")
            addPathData("M12 2v1")
            addPathData("M4.929 4.929l.707 .707")
            addPathData("M12 12v6")
        }
        return _siren!!
    }

private var _siren: ImageVector? = null

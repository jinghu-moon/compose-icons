package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinned: ImageVector
    get() {
        if (_mapPinned != null) return _mapPinned!!
        _mapPinned = lucideOutlineIcon(
            name = "MapPinned",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 8c0 3.613-3.869 7.429-5.393 8.795-.358 .274-.856 .274-1.214 0C9.87 15.429 6 11.613 6 8 6 4.686 8.686 2 12 2c3.314 0 6 2.686 6 6")
            addPathData("M14 8c0 1.105-.895 2-2 2C10.895 10 10 9.105 10 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M8.714 14h-3.71c-.43 0-.812 .275-.948 .683L2.052 20.683c-.102 .305-.051 .64 .137 .901 .188 .261 .49 .416 .811 .416h18c.321-0 .623-.155 .811-.416 .188-.261 .239-.596 .137-.9l-2-6c-.136-.409-.518-.684-.949-.684h-3.712")
        }
        return _mapPinned!!
    }

private var _mapPinned: ImageVector? = null

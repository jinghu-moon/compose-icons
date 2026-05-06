package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SportShoe: ImageVector
    get() {
        if (_sportShoe != null) return _sportShoe!!
        _sportShoe = lucideOutlineIcon(
            name = "SportShoe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 10.42 19.8 5.35")
            addPathData("M19 18h3")
            addPathData("M9.5 22 21.414 9.415c.41-.41 .622-.978 .581-1.556-.041-.579-.331-1.111-.795-1.459L15.59 2.192c-.304-.222-.707-.255-1.043-.084C14.211 2.279 14 2.623 14 3v2c0 .871-.564 1.642-1.394 1.906L8.677 8.053C8.272 8.191 8 8.572 8 9c-.155 6.393-2.082 9-4 9-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2h14")
        }
        return _sportShoe!!
    }

private var _sportShoe: ImageVector? = null

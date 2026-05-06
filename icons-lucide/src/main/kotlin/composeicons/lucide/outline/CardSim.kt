package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CardSim: ImageVector
    get() {
        if (_cardSim != null) return _cardSim!!
        _cardSim = lucideOutlineIcon(
            name = "CardSim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 14v4")
            addPathData("M14.172 2c.53 0 1.039 .211 1.414 .586l3.828 3.828c.375 .375 .586 .884 .586 1.414v12.172c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
            addPathData("M8 14h8")
            addPathData("M9 10h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C8.448 18 8 17.552 8 17v-6c0-.552 .448-1 1-1Z")
        }
        return _cardSim!!
    }

private var _cardSim: ImageVector? = null

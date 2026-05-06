package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.JapaneseYen: ImageVector
    get() {
        if (_japaneseYen != null) return _japaneseYen!!
        _japaneseYen = lucideOutlineIcon(
            name = "JapaneseYen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9.5v11.5M12 9.5 6 3 12 9.5 18 3")
            addPathData("M6 15h12")
            addPathData("M6 11h12")
        }
        return _japaneseYen!!
    }

private var _japaneseYen: ImageVector? = null

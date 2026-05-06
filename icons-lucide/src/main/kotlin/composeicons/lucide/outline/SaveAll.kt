package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SaveAll: ImageVector
    get() {
        if (_saveAll != null) return _saveAll!!
        _saveAll = lucideOutlineIcon(
            name = "SaveAll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2v3c0 .552 .448 1 1 1h5")
            addPathData("M18 18v-6c0-.552-.448-1-1-1h-6c-.552 0-1 .448-1 1v6")
            addPathData("M18 22h-14C2.895 22 2 21.105 2 20v-14")
            addPathData("M8 18C6.895 18 6 17.105 6 16v-12C6 2.895 6.895 2 8 2h9.172c.53 0 1.039 .211 1.414 .586l2.828 2.828c.375 .375 .586 .884 .586 1.414v9.172c0 .532-.212 1.042-.589 1.418-.377 .375-.889 .585-1.421 .582Z")
        }
        return _saveAll!!
    }

private var _saveAll: ImageVector? = null

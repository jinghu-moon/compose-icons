package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pipette: ImageVector
    get() {
        if (_pipette != null) return _pipette!!
        _pipette = lucideOutlineIcon(
            name = "Pipette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9 3.586 17.414c-.375 .375-.586 .884-.586 1.414v1.344c-0 .53-.211 1.039-.586 1.414 .375-.375 .884-.586 1.414-.586h1.344c.53-0 1.039-.211 1.414-.586L15 12")
            addPathData("M18 9l.4 .4c.828 .828 .828 2.172 0 3-.828 .828-2.172 .828-3 0L11.6 8.6c-.828-.828-.828-2.172 0-3 .828-.828 2.172-.828 3 0L15 6 18.4 2.6c.828-.828 2.172-.828 3 0 .828 .828 .828 2.172 0 3Z")
            addPathData("M2 22l.414-.414")
        }
        return _pipette!!
    }

private var _pipette: ImageVector? = null

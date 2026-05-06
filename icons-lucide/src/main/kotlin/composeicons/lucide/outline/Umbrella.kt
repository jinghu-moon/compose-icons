package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = lucideOutlineIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M12 2v2")
            addPathData("M20.992 13c.315 .003 .613-.143 .804-.394 .191-.251 .252-.577 .166-.88C20.795 7.178 16.696 3.997 12 3.997c-4.696 0-8.795 3.18-9.961 7.729-.086 .302-.025 .626 .163 .876 .189 .25 .484 .398 .798 .398Z")
        }
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null

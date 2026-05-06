package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Origami: ImageVector
    get() {
        if (_origami != null) return _origami!!
        _origami = lucideOutlineIcon(
            name = "Origami",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-8c0-.552 .448-1 1-1h6.297c.418 0 .793 .261 .938 .653 .145 .392 .031 .834-.287 1.106L15.252 8.784")
            addPathData("M12 21 4.586 13.586C4.211 13.211 4 12.702 4 12.172v-5.757c.002-.403 .246-.766 .619-.921 .373-.154 .802-.07 1.088 .214L20 20.009")
            addPathData("M12.214 3.381l8.414 14.966c.22 .392 .152 .882-.167 1.199l-1.168 1.163c-.188 .187-.441 .291-.706 .291h-12.236c-.227 0-.448-.077-.625-.219L3.25 18.8c-.333-.266-.46-.714-.318-1.115 .142-.401 .523-.669 .949-.666l4.165 .027")
        }
        return _origami!!
    }

private var _origami: ImageVector? = null

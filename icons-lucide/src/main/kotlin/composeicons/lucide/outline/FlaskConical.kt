package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlaskConical: ImageVector
    get() {
        if (_flaskConical != null) return _flaskConical!!
        _flaskConical = lucideOutlineIcon(
            name = "FlaskConical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 2v6c-0 .335 .084 .666 .245 .96l5.51 10.08c.339 .62 .326 1.372-.034 1.98-.36 .608-1.014 .98-1.721 .98h-12c-.706 0-1.361-.372-1.721-.98-.36-.608-.373-1.36-.034-1.98L9.755 8.96C9.916 8.666 10 8.335 10 8v-6")
            addPathData("M6.453 15h11.094")
            addPathData("M8.5 2h7")
        }
        return _flaskConical!!
    }

private var _flaskConical: ImageVector? = null

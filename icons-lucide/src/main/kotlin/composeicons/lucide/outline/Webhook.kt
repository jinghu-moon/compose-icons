package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Webhook: ImageVector
    get() {
        if (_webhook != null) return _webhook!!
        _webhook = lucideOutlineIcon(
            name = "Webhook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 16.98h-5.99c-1.1 0-1.95 .94-2.48 1.9-.863 1.62-2.718 2.444-4.499 2C3.25 20.435 2.001 18.835 2 17c.01-.7 .2-1.4 .57-2")
            addPathData("M6 17 9.13 11.22c.53-.97 .1-2.18-.5-3.1C7.859 6.887 7.818 5.333 8.523 4.061 9.227 2.789 10.567 2 12.021 1.999c1.454-0 2.794 .789 3.499 2.061")
            addPathData("M12 6l3.13 5.73C15.66 12.7 16.9 13 18 13c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4")
        }
        return _webhook!!
    }

private var _webhook: ImageVector? = null

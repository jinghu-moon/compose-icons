package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radiation: ImageVector
    get() {
        if (_radiation != null) return _radiation!!
        _radiation = lucideOutlineIcon(
            name = "Radiation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12h.01")
            addPathData("M14 15.464c-1.238 .715-2.762 .715-4 0L7.528 19.746c-.142 .246-.173 .542-.084 .812 .089 .27 .289 .49 .549 .604 2.555 1.117 5.459 1.117 8.014 0 .261-.114 .46-.334 .549-.604 .089-.27 .058-.566-.084-.812Z")
            addPathData("M16 12C16 10.571 15.238 9.251 14 8.536L16.472 4.254c.142-.247 .383-.421 .662-.479 .279-.058 .569 .005 .798 .174 2.244 1.654 3.696 4.169 4.006 6.94 .031 .273-.052 .547-.23 .758-.177 .21-.434 .338-.708 .353Z")
            addPathData("M8 12c0-1.429 .762-2.749 2-3.464L7.528 4.254C7.386 4.007 7.145 3.833 6.866 3.775c-.279-.058-.569 .005-.798 .174C3.824 5.603 2.372 8.118 2.062 10.889c-.031 .273 .052 .547 .23 .758 .177 .21 .434 .338 .708 .353Z")
        }
        return _radiation!!
    }

private var _radiation: ImageVector? = null

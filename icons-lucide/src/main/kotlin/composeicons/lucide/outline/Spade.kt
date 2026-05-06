package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = lucideOutlineIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18v4")
            addPathData("M2 14.499c0 2.278 1.405 4.32 3.532 5.135 2.127 .815 4.536 .235 6.059-1.46 .231-.214 .588-.214 .818 .001 1.522 1.694 3.932 2.275 6.059 1.46 2.127-.815 3.532-2.857 3.532-5.135C22 12.21 20.5 10.5 19 9L13.508 3.688c-.377-.433-.921-.683-1.495-.687-.574-.004-1.122 .239-1.505 .667L5 8.999C3.5 10.499 2 12.199 2 14.499")
        }
        return _spade!!
    }

private var _spade: ImageVector? = null

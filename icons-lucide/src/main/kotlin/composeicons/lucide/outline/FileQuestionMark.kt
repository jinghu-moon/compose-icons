package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileQuestionMark: ImageVector
    get() {
        if (_fileQuestionMark != null) return _fileQuestionMark!!
        _fileQuestionMark = lucideOutlineIcon(
            name = "FileQuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 22C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.639-.001 1.253 .253 1.704 .706l3.588 3.588c.454 .451 .709 1.066 .708 1.706v12c0 1.105-.895 2-2 2Z")
            addPathData("M12 17h.01")
            addPathData("M9.1 9C9.595 7.635 10.997 6.821 12.428 7.067c1.431 .246 2.481 1.481 2.492 2.933 0 2-3 3-3 3")
        }
        return _fileQuestionMark!!
    }

private var _fileQuestionMark: ImageVector? = null

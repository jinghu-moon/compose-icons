package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = lucideOutlineIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.1 2.182c1.255-.243 2.545-.243 3.8 0")
            addPathData("M13.9 21.818c-1.255 .243-2.545 .243-3.8 0")
            addPathData("M17.609 3.721c1.061 .719 1.975 1.636 2.69 2.7")
            addPathData("M2.182 13.9c-.243-1.255-.243-2.545 0-3.8")
            addPathData("M20.279 17.609c-.719 1.061-1.636 1.975-2.7 2.69")
            addPathData("M21.818 10.1c.243 1.255 .243 2.545 0 3.8")
            addPathData("M3.721 6.391C4.44 5.33 5.357 4.416 6.421 3.701")
            addPathData("M6.391 20.279C5.33 19.56 4.416 18.643 3.701 17.579")
        }
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null

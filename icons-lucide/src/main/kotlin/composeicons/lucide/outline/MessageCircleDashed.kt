package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleDashed: ImageVector
    get() {
        if (_messageCircleDashed != null) return _messageCircleDashed!!
        _messageCircleDashed = lucideOutlineIcon(
            name = "MessageCircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.1 2.182c1.255-.243 2.545-.243 3.8 0")
            addPathData("M13.9 21.818c-1.255 .243-2.545 .243-3.8 0")
            addPathData("M17.609 3.72c1.061 .719 1.975 1.636 2.69 2.7")
            addPathData("M2.182 13.9c-.243-1.255-.243-2.545 0-3.8")
            addPathData("M20.28 17.61c-.719 1.061-1.636 1.975-2.7 2.69")
            addPathData("M21.818 10.1c.243 1.255 .243 2.545 0 3.8")
            addPathData("M3.721 6.391C4.44 5.33 5.357 4.416 6.421 3.701")
            addPathData("M6.163 21.117l-2.906 .85c-.335 .089-.692-.002-.944-.24-.252-.238-.362-.59-.292-.929l.965-2.98")
        }
        return _messageCircleDashed!!
    }

private var _messageCircleDashed: ImageVector? = null

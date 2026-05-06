package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GamepadDirectional: ImageVector
    get() {
        if (_gamepadDirectional != null) return _gamepadDirectional!!
        _gamepadDirectional = lucideOutlineIcon(
            name = "GamepadDirectional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.146 15.854c.226-.227 .534-.354 .854-.354 .32 0 .628 .127 .854 .354l1.56 1.56c.375 .375 .586 .884 .586 1.414v2.172c0 .552-.448 1-1 1h-4C9.448 22 9 21.552 9 21v-2.172c0-.53 .211-1.039 .586-1.414Z")
            addPathData("M18.828 15c-.53-0-1.039-.211-1.414-.586L15.854 12.854c-.227-.226-.354-.534-.354-.854 0-.32 .127-.628 .354-.854L17.414 9.586c.375-.375 .884-.586 1.414-.586h2.172c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1Z")
            addPathData("M6.586 14.414c-.375 .375-.884 .586-1.414 .586h-2.172C2.448 15 2 14.552 2 14v-4C2 9.448 2.448 9 3 9h2.172c.53 0 1.039 .211 1.414 .586l1.56 1.56c.227 .226 .354 .534 .354 .854 0 .32-.127 .628-.354 .854Z")
            addPathData("M9 3C9 2.448 9.448 2 10 2h4c.552 0 1 .448 1 1v2.172c-0 .53-.211 1.039-.586 1.414L12.854 8.146c-.226 .227-.534 .354-.854 .354-.32 0-.628-.127-.854-.354L9.586 6.586C9.211 6.211 9 5.702 9 5.172Z")
        }
        return _gamepadDirectional!!
    }

private var _gamepadDirectional: ImageVector? = null

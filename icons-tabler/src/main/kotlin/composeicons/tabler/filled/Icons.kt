package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Icons: ImageVector
    get() {
        if (_icons != null) return _icons!!
        _icons = tablerFilledIcon(
            name = "Icons",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.25 2.603C6.014 1.585 8.242 1.878 9.682 3.318c1.44 1.44 1.733 3.668 .715 5.432C9.379 10.514 7.303 11.374 5.335 10.847 3.368 10.32 2 8.537 2 6.5l.006-.229C2.084 4.747 2.928 3.366 4.25 2.603")
            addPathData("M5.632 13.504c.178-.311 .509-.503 .868-.503 .359 0 .69 .192 .868 .503l4 7c.177 .309 .175 .69-.003 .998-.179 .308-.508 .498-.865 .498h-8c-.356-0-.686-.19-.865-.498-.179-.308-.18-.688-.003-.998Z")
            addPathData("M13.293 2.293c.391-.39 1.023-.39 1.414 0l7 7c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L13.293 3.707c-.39-.39-.39-1.024 0-1.414")
            addPathData("M20.293 2.293c.392-.379 1.016-.374 1.402 .012 .386 .386 .391 1.009 .012 1.402l-7 7c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402Z")
            addPathData("M21 13c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-7c-.552 0-1-.448-1-1v-7c0-.552 .448-1 1-1Z")
        }
        return _icons!!
    }

private var _icons: ImageVector? = null

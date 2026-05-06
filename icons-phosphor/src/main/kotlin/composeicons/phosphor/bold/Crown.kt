package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = phosphorBoldIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 80c.018-13.387-8.299-25.369-20.847-30.035-12.547-4.666-26.673-1.029-35.406 9.117C187.014 69.227 185.519 83.737 192 95.45l-20.86 25.66L150.82 74.4c12.34-12.552 12.225-32.714-.257-45.125-12.482-12.411-32.644-12.411-45.126 0C92.955 41.686 92.84 61.848 105.18 74.4L84.87 121.11 64 95.45C70.651 83.387 68.836 68.422 59.494 58.299 50.153 48.176 35.382 45.166 22.824 50.828 10.267 56.489 2.742 69.551 4.143 83.255 5.544 96.958 15.557 108.227 29 111.23l14 84.06c1.588 9.676 9.975 16.761 19.78 16.71h130.44c9.805 .051 18.192-7.034 19.78-16.71l14-84.06C241.605 107.937 251.984 94.971 252 80ZM220 72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM128 44c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM36 72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM189.83 188h-123.66L55.29 122.78l23.4 28.79c2.278 2.803 5.698 4.43 9.31 4.43 .545-.002 1.09-.039 1.63-.11 4.148-.57 7.699-3.261 9.37-7.1L127.18 84h.82 .82L157 148.79c1.671 3.839 5.222 6.53 9.37 7.1 .54 .071 1.085 .108 1.63 .11 3.612-0 7.032-1.627 9.31-4.43l23.4-28.79Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _crown!!
    }

private var _crown: ImageVector? = null

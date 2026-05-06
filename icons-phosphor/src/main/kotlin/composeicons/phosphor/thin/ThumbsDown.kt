package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorThinIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.85 157.52l-12-96C222.599 51.509 214.088 43.998 204 44h-172C25.373 44 20 49.373 20 56v88c0 6.627 5.373 12 12 12h45.53l38.89 77.79c.678 1.355 2.064 2.211 3.58 2.21 19.882 0 36-16.118 36-36v-20h60c5.737 .001 11.199-2.461 14.996-6.762 3.797-4.301 5.565-10.025 4.854-15.718ZM76 148h-44c-2.209 0-4-1.791-4-4v-88c0-2.209 1.791-4 4-4h44ZM225 167.94c-2.279 2.582-5.556 4.061-9 4.06h-64c-2.209 0-4 1.791-4 4v24c.002 14.528-11.107 26.644-25.58 27.9L84 151.06v-99.06h120c6.052-.001 11.158 4.504 11.91 10.51l12 96c.427 3.415-.633 6.849-2.91 9.43Z"),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null

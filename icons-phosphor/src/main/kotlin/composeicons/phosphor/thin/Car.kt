package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorThinIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 108h-13.4L197.77 43.13c-1.93-4.346-6.244-7.143-11-7.13h-117.57c-4.756-.013-9.07 2.784-11 7.13L29.4 108h-13.4c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v84c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-20h104v20c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-84h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM65.54 46.38c.641-1.448 2.076-2.381 3.66-2.38h117.6c1.584-.001 3.019 .932 3.66 2.38L217.84 108h-179.68ZM68 200c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-20h32ZM216 204h-24c-2.209 0-4-1.791-4-4v-20h32v20c0 2.209-1.791 4-4 4ZM220 172h-184v-56h184ZM60 144c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM172 144c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4Z"),
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
        return _car!!
    }

private var _car: ImageVector? = null

package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorRegularIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.79 118.17c-.615-2.604-2.492-4.728-5-5.66L153.18 90.9 167.84 17.57c.682-3.5-1.035-7.029-4.21-8.653-3.175-1.623-7.041-.949-9.48 1.653L42.15 130.57c-1.848 1.947-2.596 4.691-1.992 7.306 .604 2.615 2.478 4.754 4.992 5.694l57.63 21.61L88.16 238.43c-.682 3.5 1.035 7.029 4.21 8.653 3.175 1.624 7.041 .949 9.48-1.653L213.85 125.43c1.814-1.947 2.541-4.668 1.94-7.26ZM109.37 214l10.47-52.38c.774-3.836-1.342-7.67-5-9.06L62 132.71 146.62 42.05 136.16 94.43c-.774 3.836 1.342 7.67 5 9.06l52.8 19.8Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null

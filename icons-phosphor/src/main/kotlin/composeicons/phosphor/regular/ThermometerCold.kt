package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorRegularIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.91 77.72l-20 6.49 12.34 17c1.775 2.307 2.158 5.396 .998 8.066-1.16 2.67-3.678 4.499-6.576 4.777-2.898 .277-5.717-1.041-7.362-3.443L216 93.61l-12.34 17c-2.642 3.433-7.537 4.139-11.042 1.593-3.505-2.546-4.346-7.419-1.898-10.993l12.34-17-20-6.49c-4.203-1.364-6.504-5.877-5.14-10.08 1.364-4.203 5.877-6.504 10.08-5.14L208 69v-21c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v21l20-6.49c4.203-1.367 8.718 .932 10.085 5.135 1.367 4.203-.932 8.718-5.135 10.085ZM152 184c-.008 16.627-12.75 30.478-29.319 31.871C106.112 217.265 91.237 205.736 88.452 189.344 85.667 172.951 95.901 157.157 112 153v-33c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v33c14.122 3.668 23.986 16.409 24 31ZM136 184c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16ZM184 184c-.019 29.839-20.655 55.706-49.744 62.352-29.089 6.646-58.912-7.691-71.888-34.561C49.392 184.921 56.707 152.649 80 134v-86C80 25.909 97.909 8 120 8c22.091 0 40 17.909 40 40v86c15.172 12.162 24 30.555 24 50ZM168 184c-.013-15.706-7.696-30.416-20.58-39.4C145.265 143.095 143.987 140.628 144 138v-90C144 34.745 133.255 24 120 24 106.745 24 96 34.745 96 48v90c0 2.614-1.277 5.063-3.42 6.56C73.883 157.573 66.907 181.936 75.884 202.873c8.977 20.937 31.433 32.68 53.75 28.108C151.951 226.408 167.98 206.78 168 184Z"),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null

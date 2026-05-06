package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorFillIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.87 90.86c-.663-1.003-1.741-1.655-2.938-1.775-1.196-.12-2.383 .304-3.232 1.155l-75.42 75.42c-3.169 2.816-7.985 2.672-10.979-.33-2.994-3.002-3.126-7.818-.301-10.98L221.7 61.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L197 63.73C157.778 33.098 103.053 32.006 62.64 61.048 22.227 90.091 5.813 142.308 22.34 189.25c2.259 6.421 8.314 10.725 15.12 10.75h181.07c6.801 .004 12.861-4.291 15.11-10.71 11.557-32.859 7.209-69.222-11.77-98.43ZM57.44 166.41c.878 4.33-1.92 8.552-6.25 9.43-.526 .108-1.063 .161-1.6 .16-3.801-.005-7.074-2.684-7.83-6.41C35.952 140.997 44.683 111.383 65.074 90.515 85.466 69.647 114.87 60.234 143.59 65.38c4.349 .779 7.244 4.936 6.465 9.285-.779 4.349-4.936 7.244-9.285 6.465C117.268 76.923 93.208 84.627 76.522 101.704 59.836 118.78 52.69 143.012 57.44 166.41Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null

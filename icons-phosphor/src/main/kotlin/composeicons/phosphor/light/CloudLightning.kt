package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorLightIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 18C124.624 18.006 96.642 37.744 86.11 67.3c-.574-.301-1.191-.511-1.83-.62C81.543 66.228 78.774 66 76 66 48.386 66 26 88.386 26 116c0 27.614 22.386 50 50 50h41.4L98.85 196.91c-1.114 1.855-1.144 4.165-.077 6.048 1.066 1.882 3.064 3.045 5.227 3.042h29.4l-18.55 30.91c-1.707 2.844-.784 6.533 2.06 8.24 2.844 1.707 6.533 .784 8.24-2.06l24-40c1.114-1.855 1.144-4.165 .077-6.048C148.161 195.16 146.163 193.998 144 194h-29.4l16.8-28h24.6c40.869 0 74-33.131 74-74C230 51.131 196.869 18 156 18ZM156 154h-80C61.677 153.983 48.58 145.914 42.124 133.128 35.668 120.343 36.95 105.013 45.439 93.477 53.928 81.941 68.183 76.159 82.31 78.52c.262 .042 .525 .069 .79 .08-.555 2.991-.923 6.013-1.1 9.05-.193 3.314 2.336 6.157 5.65 6.35 3.314 .193 6.157-2.336 6.35-5.65C95.955 54.604 124.558 28.63 158.336 29.926c33.778 1.296 60.306 29.386 59.67 63.182C217.369 126.904 189.802 153.976 156 154Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null

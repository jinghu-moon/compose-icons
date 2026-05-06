package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorLightIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.54 69.71C244.614 67.467 242.427 66.002 240 66h-31.6C200.26 51.32 184.855 42.153 168.07 42c-12.097-.155-23.746 4.575-32.31 13.12C126.933 63.78 121.972 75.634 122 88v8.66C80 86.66 45.4 52.14 45 51.78 43.355 50.147 40.916 49.607 38.736 50.393c-2.181 .787-3.713 2.759-3.936 5.067-4.25 47.22 9.42 78.75 21.64 96.89 6.317 9.503 14.104 17.941 23.07 25-15.49 19-41.34 28.89-41.62 29-1.73 .64-3.07 2.041-3.632 3.798-.562 1.757-.285 3.676 .752 5.202C36 216.83 45.78 230 80 230c69.88 0 128.23-54 133.82-123.34L244.24 76.25c1.716-1.716 2.229-4.298 1.3-6.54ZM203.76 99.76c-1.033 1.031-1.656 2.403-1.75 3.86C197.93 167.76 144.33 218 80 218c-14 0-22.76-2.41-28.06-4.8 11.3-5.68 29.72-16.88 41.05-33.87 .913-1.374 1.221-3.063 .85-4.67-.374-1.618-1.403-3.008-2.84-3.84-.13-.08-13.13-7.86-25-25.72C52 124 45.31 98.43 46 68.88c14.88 12.6 45.57 35.09 81 41 1.742 .294 3.525-.194 4.874-1.335 1.349-1.141 2.127-2.818 2.126-4.585v-15.96c-.019-9.154 3.655-17.929 10.19-24.34 6.292-6.282 14.849-9.764 23.74-9.66 13.43 .17 26 8.37 31.24 20.4 .954 2.187 3.114 3.6 5.5 3.6h20.84Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = phosphorLightIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.86 163.71C223.56 158.21 230 143.5 230 120 230 96.5 223.56 81.79 210.86 76.29c-14.5-6.29-34 1.5-51 11.8C170.16 71.16 177.94 51.64 171.66 37.14 166.21 24.44 151.5 18 128 18 104.5 18 89.79 24.44 84.29 37.14c-6.28 14.5 1.5 34 11.8 51C79.17 77.79 59.64 70 45.14 76.29 32.44 81.79 26 96.5 26 120c0 23.5 6.44 38.21 19.14 43.71 3.681 1.555 7.644 2.335 11.64 2.29 12.42 0 26.6-6.33 39.32-14.08C85.79 168.85 78 188.38 84.29 202.92 89.79 215.56 104.5 222 128 222c23.5 0 38.21-6.44 43.71-19.14 3-6.82 2.79-14.76 .72-23 12.62 18.21 24.22 39.49 29.75 61.6 .67 2.669 3.069 4.54 5.82 4.54 .492-.001 .982-.062 1.46-.18 1.544-.387 2.87-1.372 3.688-2.737 .818-1.365 1.059-2.999 .672-4.543-7.56-30.24-25.2-58.44-42.18-80.2 9.32 4.51 18.88 7.63 27.58 7.63 3.994 .053 7.956-.716 11.64-2.26ZM95.3 41.91C98.73 34 109.73 30 128 30c18.27 0 29.27 4 32.7 11.91 3.9 9-1.11 24.85-14.11 44.61C140.907 95.058 134.698 103.233 128 111 121.303 103.243 115.094 95.077 109.41 86.55 96.41 66.76 91.4 50.91 95.3 41.91ZM49.91 152.7C42 149.27 38 138.27 38 120 38 101.73 42 90.73 49.91 87.3c2.22-.906 4.603-1.345 7-1.29 9.26 0 22.27 5.28 37.65 15.4 8.526 5.682 16.688 11.891 24.44 18.59-7.755 6.7-15.921 12.909-24.45 18.59-19.79 13-35.64 18.01-44.64 14.11ZM160.7 198.09C157.27 206 146.27 210 128 210c-18.27 0-29.27-4-32.7-11.91-3.9-9 1.11-24.85 14.11-44.61C115.09 144.941 121.299 136.765 128 129c6.7 7.755 12.909 15.921 18.59 24.45 13 19.79 18.01 35.63 14.11 44.64ZM161.48 138.59C152.941 132.91 144.765 126.701 137 120c7.755-6.7 15.921-12.909 24.45-18.59 19.76-13 35.61-18 44.61-14.11C214 90.73 218 101.73 218 120c0 18.27-4 29.27-11.91 32.7-9 3.9-24.85-1.11-44.61-14.11Z"),
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
        return _clover!!
    }

private var _clover: ImageVector? = null

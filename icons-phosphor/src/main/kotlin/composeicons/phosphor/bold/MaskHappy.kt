package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) return _maskHappy!!
        _maskHappy = phosphorBoldIcon(
            name = "MaskHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.29 31.5c-5.443-3.723-12.371-4.524-18.52-2.14C187 34.72 159.17 43.7 128 43.7c-31.17 0-59-9-72.77-14.34C49.079 26.975 42.147 27.777 36.703 31.504 31.258 35.231 28.002 41.402 28 48v55.77c0 36.64 9.9 71.25 27.88 97.45C74.81 228.81 100.42 244 128 244c27.58 0 53.19-15.19 72.12-42.76C218.1 175 228 140.43 228 103.79v-55.79c-.003-6.6-3.262-12.774-8.71-16.5ZM204 103.79c0 31.84-8.41 61.63-23.67 83.87C166 208.51 147.43 220 128 220 108.57 220 90 208.51 75.67 187.66 60.41 165.42 52 135.63 52 103.79v-50c16.59 5.95 44.67 13.94 76 13.94 31.33 0 59.41-8 76-13.94ZM165.33 166.67c4.162 5.154 3.361 12.705-1.79 16.87-20.782 16.612-50.298 16.612-71.08 0-5.105-4.179-5.879-11.694-1.734-16.826 4.145-5.132 11.655-5.956 16.814-1.844 11.983 9.507 28.937 9.507 40.92 0 5.156-4.16 12.708-3.354 16.87 1.8ZM137.89 131.16c-3.581-5.575-1.965-12.998 3.61-16.58 11.741-7.521 26.465-8.669 39.23-3.06 6.092 2.612 8.912 9.668 6.3 15.76-2.612 6.092-9.668 8.912-15.76 6.3-2.3-.988-4.768-1.524-7.27-1.58-3.362 .071-6.645 1.027-9.52 2.77-2.678 1.723-5.931 2.31-9.043 1.633-3.112-.677-5.827-2.563-7.547-5.243ZM92 132c-2.503 .057-4.972 .597-7.27 1.59-6.092 2.612-13.148-.208-15.76-6.3-2.612-6.092 .208-13.148 6.3-15.76 12.753-5.636 27.482-4.51 39.23 3 5.575 3.59 7.185 11.02 3.595 16.595-3.59 5.575-11.02 7.185-16.595 3.595C98.625 133 95.35 132.063 92 132Z"),
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
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null

package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = phosphorRegularIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.66 165.54C225.16 159.7 232 144.37 232 120 232 95.63 225.16 80.3 211.66 74.45c-11.65-5-27.24-2.23-46.46 8.35 10.58-19.22 13.39-34.81 8.35-46.46C167.7 22.84 152.37 16 128 16 103.63 16 88.3 22.84 82.45 36.34c-5 11.65-2.23 27.24 8.35 46.45C71.58 72.22 56 69.4 44.34 74.45 30.84 80.3 24 95.63 24 120c0 24.37 6.84 39.7 20.34 45.54 3.939 1.671 8.181 2.509 12.46 2.46 9.6 0 21-3.62 34-10.79C80.22 176.41 77.41 192 82.45 203.65 88.3 217.15 103.63 224 128 224c24.37 0 39.7-6.85 45.55-20.35 1.963-4.742 2.765-9.885 2.34-15 10.45 16.23 19.64 34.48 24.35 53.33 .906 3.545 4.101 6.024 7.76 6.02 .657-.001 1.312-.081 1.95-.24 4.285-1.072 6.891-5.414 5.82-9.7-6.94-27.76-22.27-53.8-37.86-74.79Q189.68 168 199.2 168c4.279 .049 8.521-.789 12.46-2.46ZM205.29 89.14C214.14 93 216 108 216 120c0 12-1.86 27-10.7 30.86-8.36 3.63-23.52-1.31-42.68-13.91-7.836-5.226-15.362-10.902-22.54-17 18.41-15.58 50.32-37.27 65.21-30.81ZM97.14 42.7C101 33.86 116 32 128 32c12 0 27 1.86 30.86 10.7 3.63 8.36-1.31 23.52-13.91 42.68-5.226 7.836-10.902 15.362-17 22.54C112.37 89.51 90.69 57.59 97.14 42.7ZM50.71 150.86C41.86 147 40 132 40 120 40 108 41.86 93 50.7 89.14 52.699 88.33 54.844 87.942 57 88c8.75 0 21.34 5.17 36.4 15.07 7.836 5.226 15.362 10.902 22.54 17C97.51 135.62 65.59 157.32 50.71 150.86ZM158.86 197.29C155 206.14 140 208 128 208c-12 0-27-1.86-30.86-10.7-3.63-8.36 1.31-23.52 13.91-42.68 5.226-7.836 10.902-15.362 17-22.54 15.58 18.41 37.26 50.33 30.81 65.21Z"),
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

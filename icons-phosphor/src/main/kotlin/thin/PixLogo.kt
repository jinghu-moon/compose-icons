package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorThinIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.500 119.550 L 136.450 23.550 C 131.772 18.911 124.228 18.911 119.550 23.550 L 23.550 119.600 C 18.911 124.278 18.911 131.822 23.550 136.500 L 119.600 232.550 C 124.278 237.189 131.822 237.189 136.500 232.550 L 232.550 136.500 C 237.189 131.822 237.189 124.278 232.550 119.600 ZM 125.210 29.160 C 125.949 28.419 126.953 28.002 128.000 28.002 C 129.047 28.002 130.051 28.419 130.790 29.160 L 193.640 92.000 L 160.000 92.000 C 158.939 91.999 157.921 92.420 157.170 93.170 L 128.000 122.340 L 98.830 93.170 C 98.079 92.420 97.061 91.999 96.000 92.000 L 62.360 92.000 ZM 28.000 128.000 C 27.996 126.952 28.414 125.946 29.160 125.210 L 54.360 100.000 L 94.360 100.000 L 122.360 128.000 L 94.360 156.000 L 54.360 156.000 L 29.160 130.790 C 28.414 130.054 27.996 129.048 28.000 128.000 ZM 130.790 226.840 C 129.237 228.352 126.763 228.352 125.210 226.840 L 62.360 164.000 L 96.000 164.000 C 97.061 164.001 98.079 163.580 98.830 162.830 L 128.000 133.660 L 157.170 162.830 C 157.921 163.580 158.939 164.001 160.000 164.000 L 193.640 164.000 ZM 226.840 130.790 L 201.640 156.000 L 161.640 156.000 L 133.640 128.000 L 161.640 100.000 L 201.640 100.000 L 226.840 125.210 C 227.581 125.949 227.998 126.953 227.998 128.000 C 227.998 129.047 227.581 130.051 226.840 130.790 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null

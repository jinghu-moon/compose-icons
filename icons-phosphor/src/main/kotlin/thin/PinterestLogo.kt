package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorThinIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 112.000 C 220.000 133.530 212.500 153.180 198.880 167.340 C 186.260 180.470 169.170 188.000 152.000 188.000 C 130.650 188.000 118.480 179.240 112.240 172.430 L 99.890 224.920 C 99.464 226.724 97.854 227.999 96.000 228.000 C 95.690 227.997 95.382 227.960 95.080 227.890 C 94.043 227.652 93.144 227.011 92.581 226.108 C 92.018 225.206 91.838 224.116 92.080 223.080 L 124.080 87.080 C 124.652 85.005 126.763 83.755 128.857 84.250 C 130.951 84.745 132.278 86.809 131.860 88.920 L 114.580 162.370 C 117.000 166.420 127.000 180.000 152.000 180.000 C 181.490 180.000 212.000 154.560 212.000 112.000 C 211.991 80.055 192.007 51.526 161.988 40.602 C 131.969 29.679 98.323 38.693 77.786 63.162 C 57.250 87.631 54.206 122.330 70.170 150.000 C 71.275 151.914 70.619 154.360 68.705 155.465 C 66.791 156.570 64.345 155.914 63.240 154.000 C 45.597 123.417 48.961 85.066 71.659 58.022 C 94.357 30.978 131.544 21.014 164.723 33.088 C 197.902 45.161 219.990 76.693 220.000 112.000 Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null

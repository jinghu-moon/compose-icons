package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorThinIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 80.000 C 235.999 55.737 221.385 33.863 198.970 24.574 C 176.556 15.285 150.753 20.410 133.590 37.560 L 63.520 106.830 C 61.260 109.072 59.992 112.126 60.000 115.310 L 60.000 190.310 L 29.170 221.170 C 27.607 222.733 27.607 225.267 29.170 226.830 C 30.733 228.393 33.267 228.393 34.830 226.830 L 65.660 196.000 L 140.660 196.000 C 143.840 196.000 146.890 194.737 149.140 192.490 L 149.140 192.490 L 218.000 122.830 L 218.000 122.830 L 218.400 122.430 C 229.697 111.205 236.035 95.926 236.000 80.000 ZM 139.230 43.230 C 159.448 23.420 191.797 23.419 212.016 43.229 C 232.234 63.039 232.894 95.382 213.500 116.000 L 145.660 116.000 L 186.830 74.830 C 188.393 73.267 188.393 70.733 186.830 69.170 C 185.267 67.607 182.733 67.607 181.170 69.170 L 116.000 134.340 L 116.000 66.190 ZM 68.000 115.310 C 68.002 114.257 68.419 113.248 69.160 112.500 L 108.000 74.100 L 108.000 142.340 L 68.000 182.340 ZM 143.510 186.830 C 142.762 187.578 141.748 187.998 140.690 188.000 L 73.690 188.000 L 137.690 124.000 L 205.690 124.000 Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null

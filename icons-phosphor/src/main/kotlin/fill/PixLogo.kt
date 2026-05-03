package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorFillIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.340 139.280 L 215.780 158.830 C 215.042 159.568 214.044 159.988 213.000 160.000 L 171.320 160.000 L 139.320 128.000 L 171.320 96.000 L 213.000 96.000 C 214.058 96.002 215.072 96.422 215.820 97.170 L 235.380 116.720 C 241.573 122.972 241.555 133.050 235.340 139.280 ZM 67.050 80.000 L 88.000 80.000 C 90.119 80.001 92.151 80.843 93.650 82.340 L 128.000 116.680 L 162.350 82.340 C 163.849 80.843 165.881 80.001 168.000 80.000 L 189.000 80.000 C 190.619 80.001 192.079 79.027 192.698 77.531 C 193.318 76.036 192.975 74.314 191.830 73.170 L 139.330 20.660 C 133.089 14.456 123.011 14.456 116.770 20.660 L 64.220 73.170 C 63.075 74.314 62.732 76.036 63.352 77.531 C 63.971 79.027 65.431 80.001 67.050 80.000 ZM 189.000 176.000 L 168.000 176.000 C 165.881 175.999 163.849 175.157 162.350 173.660 L 128.000 139.310 L 93.650 173.660 C 92.151 175.157 90.119 175.999 88.000 176.000 L 67.000 176.000 C 65.381 175.999 63.921 176.973 63.302 178.469 C 62.682 179.964 63.025 181.686 64.170 182.830 L 116.670 235.340 C 122.911 241.544 132.989 241.544 139.230 235.340 L 191.730 182.830 C 192.863 181.699 193.213 180.001 192.619 178.514 C 192.024 177.027 190.601 176.038 189.000 176.000 ZM 116.740 128.000 L 84.740 96.000 L 43.000 96.000 C 41.942 96.002 40.928 96.422 40.180 97.170 L 20.660 116.720 C 14.456 122.961 14.456 133.039 20.660 139.280 L 40.220 158.830 C 40.958 159.568 41.956 159.988 43.000 160.000 L 84.680 160.000 Z"),
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

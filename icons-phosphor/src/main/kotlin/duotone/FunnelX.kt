package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorDuotoneIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 221.900 61.380 L 152.000 136.000 L 152.000 194.650 C 152.002 197.326 150.666 199.825 148.440 201.310 L 116.440 222.640 C 113.988 224.276 110.834 224.431 108.233 223.043 C 105.632 221.655 104.005 218.948 104.000 216.000 L 104.000 136.000 L 34.100 61.380 C 31.973 59.039 31.425 55.666 32.701 52.772 C 33.977 49.879 36.838 48.008 40.000 48.000 L 216.000 48.000 C 219.162 48.008 222.023 49.879 223.299 52.772 C 224.575 55.666 224.027 59.039 221.900 61.380 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 227.820 66.760 C 232.076 62.076 233.171 55.324 230.614 49.535 C 228.057 43.746 222.328 40.009 216.000 40.000 L 40.000 40.000 C 33.673 40.012 27.948 43.752 25.394 49.540 C 22.839 55.328 23.935 62.078 28.190 66.760 L 28.270 66.850 L 96.000 139.170 L 96.000 216.000 C 95.999 221.900 99.245 227.322 104.446 230.108 C 109.647 232.894 115.959 232.591 120.870 229.320 L 152.870 207.980 C 157.325 205.012 160.001 200.013 160.000 194.660 L 160.000 139.170 L 227.730 66.850 ZM 40.000 56.000 L 40.000 56.000 ZM 146.190 130.590 C 144.805 132.053 144.023 133.985 144.000 136.000 L 144.000 194.660 L 112.000 216.000 L 112.000 136.000 C 111.998 133.972 111.226 132.020 109.840 130.540 L 40.000 56.000 L 216.000 56.000 ZM 245.680 210.400 C 248.806 213.526 248.806 218.594 245.680 221.720 C 242.554 224.846 237.486 224.846 234.360 221.720 L 216.000 203.320 L 197.660 221.670 C 194.534 224.793 189.468 224.791 186.345 221.665 C 183.222 218.539 183.224 213.473 186.350 210.350 L 204.690 192.000 L 186.350 173.650 C 183.362 170.505 183.425 165.551 186.493 162.483 C 189.561 159.415 194.515 159.352 197.660 162.340 L 216.000 180.690 L 234.340 162.350 C 237.463 159.224 242.529 159.222 245.655 162.345 C 248.781 165.468 248.783 170.534 245.660 173.660 L 227.310 192.000 Z"),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null

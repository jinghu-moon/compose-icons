package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorDuotoneIcon(
            name = "Funnel",
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
                pathData = parseSvgPathData("M 230.600 49.530 C 228.083 43.714 222.337 39.964 216.000 40.000 L 40.000 40.000 C 33.673 40.012 27.948 43.752 25.394 49.540 C 22.839 55.328 23.935 62.078 28.190 66.760 L 28.270 66.850 L 96.000 139.170 L 96.000 216.000 C 95.999 221.900 99.245 227.322 104.446 230.108 C 109.647 232.894 115.959 232.591 120.870 229.320 L 152.870 207.980 C 157.325 205.012 160.001 200.013 160.000 194.660 L 160.000 139.170 L 227.740 66.850 L 227.820 66.760 C 232.122 62.096 233.217 55.311 230.600 49.530 ZM 40.000 56.000 L 40.000 56.000 ZM 146.180 130.580 C 144.796 132.047 144.017 133.983 144.000 136.000 L 144.000 194.660 L 112.000 216.000 L 112.000 136.000 C 112.001 133.969 111.228 132.013 109.840 130.530 L 40.000 56.000 L 216.000 56.000 Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null

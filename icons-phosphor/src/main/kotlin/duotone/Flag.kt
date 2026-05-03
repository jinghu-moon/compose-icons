package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorDuotoneIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 176.000 C 160.000 231.430 112.000 120.570 48.000 176.000 L 48.000 56.000 C 112.000 0.570 160.000 111.430 224.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 42.760 50.000 C 41.019 51.509 40.013 53.696 40.000 56.000 L 40.000 224.000 C 40.000 228.418 43.582 232.000 48.000 232.000 C 52.418 232.000 56.000 228.418 56.000 224.000 L 56.000 179.770 C 82.790 158.610 105.870 170.020 132.450 183.180 C 148.850 191.290 166.510 200.030 185.450 200.030 C 199.380 200.030 213.990 195.280 229.270 182.030 C 231.011 180.521 232.017 178.334 232.030 176.030 L 232.030 56.000 C 232.023 52.864 230.184 50.021 227.326 48.729 C 224.468 47.437 221.119 47.934 218.760 50.000 C 190.760 74.230 167.040 62.490 139.550 48.880 C 111.070 34.760 78.780 18.790 42.760 50.000 ZM 216.000 172.250 C 189.210 193.410 166.130 181.990 139.550 168.840 C 114.550 156.490 86.740 142.710 56.000 160.440 L 56.000 59.790 C 82.790 38.630 105.870 50.040 132.450 63.190 C 157.450 75.540 185.270 89.320 216.000 71.590 Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null

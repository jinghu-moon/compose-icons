package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorDuotoneIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 104.000 C 208.022 128.561 196.740 151.767 177.410 166.920 C 171.507 171.495 168.037 178.532 168.000 186.000 L 168.000 192.000 C 168.000 196.418 164.418 200.000 160.000 200.000 L 96.000 200.000 C 91.582 200.000 88.000 196.418 88.000 192.000 L 88.000 186.000 C 87.992 178.572 84.561 171.563 78.700 167.000 C 59.432 151.948 48.120 128.900 48.000 104.450 C 47.760 61.090 82.720 25.000 126.070 24.000 C 147.620 23.480 168.467 31.678 183.890 46.738 C 199.313 61.798 208.006 82.444 208.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 176.000 232.000 C 176.000 236.418 172.418 240.000 168.000 240.000 L 88.000 240.000 C 83.582 240.000 80.000 236.418 80.000 232.000 C 80.000 227.582 83.582 224.000 88.000 224.000 L 168.000 224.000 C 172.418 224.000 176.000 227.582 176.000 232.000 ZM 216.000 104.000 C 216.070 131.026 203.654 156.569 182.360 173.210 C 178.378 176.262 176.031 180.983 176.000 186.000 L 176.000 192.000 C 176.000 200.837 168.837 208.000 160.000 208.000 L 96.000 208.000 C 87.163 208.000 80.000 200.837 80.000 192.000 L 80.000 186.000 C 79.997 181.043 77.696 176.367 73.770 173.340 C 52.531 156.799 40.078 131.410 40.000 104.490 C 39.740 56.830 78.260 17.140 125.880 16.000 C 149.584 15.429 172.516 24.447 189.480 41.013 C 206.445 57.578 216.007 80.289 216.000 104.000 ZM 200.000 104.000 C 200.006 84.599 192.182 66.017 178.300 52.463 C 164.419 38.909 145.655 31.531 126.260 32.000 C 87.260 32.920 55.790 65.390 56.000 104.390 C 56.074 126.407 66.266 147.167 83.640 160.690 C 91.451 166.762 96.014 176.106 96.000 186.000 L 96.000 192.000 L 160.000 192.000 L 160.000 186.000 C 160.022 176.079 164.624 166.723 172.470 160.650 C 189.900 147.029 200.060 126.121 200.000 104.000 ZM 183.890 94.660 C 179.641 70.928 161.063 52.354 137.330 48.110 C 132.972 47.375 128.845 50.312 128.110 54.670 C 127.375 59.028 130.312 63.155 134.670 63.890 C 151.240 66.680 165.300 80.740 168.110 97.340 C 168.764 101.187 172.098 104.001 176.000 104.000 C 176.452 103.997 176.903 103.961 177.350 103.890 C 181.704 103.147 184.632 99.015 183.890 94.660 Z"),
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
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null

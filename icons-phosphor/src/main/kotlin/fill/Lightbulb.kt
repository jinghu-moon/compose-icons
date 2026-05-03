package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorFillIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 232.000 C 176.000 236.418 172.418 240.000 168.000 240.000 L 88.000 240.000 C 83.582 240.000 80.000 236.418 80.000 232.000 C 80.000 227.582 83.582 224.000 88.000 224.000 L 168.000 224.000 C 172.418 224.000 176.000 227.582 176.000 232.000 ZM 216.000 104.000 C 216.070 131.026 203.654 156.569 182.360 173.210 C 178.378 176.262 176.031 180.983 176.000 186.000 L 176.000 192.000 C 176.000 200.837 168.837 208.000 160.000 208.000 L 96.000 208.000 C 87.163 208.000 80.000 200.837 80.000 192.000 L 80.000 186.000 C 79.997 181.043 77.696 176.367 73.770 173.340 C 52.531 156.799 40.078 131.410 40.000 104.490 C 39.740 56.830 78.260 17.140 125.880 16.000 C 149.584 15.429 172.516 24.447 189.480 41.013 C 206.445 57.578 216.007 80.289 216.000 104.000 ZM 183.890 94.660 C 179.641 70.928 161.063 52.354 137.330 48.110 C 132.972 47.375 128.845 50.312 128.110 54.670 C 127.375 59.028 130.312 63.155 134.670 63.890 C 151.240 66.680 165.300 80.740 168.110 97.340 C 168.764 101.187 172.098 104.001 176.000 104.000 C 176.452 103.997 176.903 103.961 177.350 103.890 C 181.704 103.147 184.632 99.015 183.890 94.660 Z"),
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

package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorRegularIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 232.000 C 176.000 236.418 172.418 240.000 168.000 240.000 L 88.000 240.000 C 83.582 240.000 80.000 236.418 80.000 232.000 C 80.000 227.582 83.582 224.000 88.000 224.000 L 168.000 224.000 C 172.418 224.000 176.000 227.582 176.000 232.000 ZM 216.000 104.000 C 216.070 131.026 203.654 156.569 182.360 173.210 C 178.378 176.262 176.031 180.983 176.000 186.000 L 176.000 192.000 C 176.000 200.837 168.837 208.000 160.000 208.000 L 96.000 208.000 C 87.163 208.000 80.000 200.837 80.000 192.000 L 80.000 186.000 C 79.997 181.043 77.696 176.367 73.770 173.340 C 52.534 156.801 40.081 131.417 40.000 104.500 C 39.740 56.830 78.260 17.150 125.880 16.000 C 149.584 15.429 172.516 24.447 189.480 41.013 C 206.445 57.578 216.007 80.289 216.000 104.000 ZM 200.000 104.000 C 200.006 84.599 192.182 66.017 178.300 52.463 C 164.419 38.909 145.655 31.531 126.260 32.000 C 87.260 32.920 55.790 65.390 56.000 104.390 C 56.073 126.407 66.265 147.168 83.640 160.690 L 83.640 160.690 C 91.451 166.762 96.014 176.106 96.000 186.000 L 96.000 192.000 L 120.000 192.000 L 120.000 147.310 L 90.340 117.660 C 87.214 114.534 87.214 109.466 90.340 106.340 C 93.466 103.214 98.534 103.214 101.660 106.340 L 128.000 132.690 L 154.340 106.340 C 157.466 103.214 162.534 103.214 165.660 106.340 C 168.786 109.466 168.786 114.534 165.660 117.660 L 136.000 147.310 L 136.000 192.000 L 160.000 192.000 L 160.000 186.000 C 160.018 176.077 164.621 166.720 172.470 160.650 C 189.900 147.029 200.060 126.121 200.000 104.000 Z"),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null

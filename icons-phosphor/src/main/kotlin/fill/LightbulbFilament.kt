package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorFillIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 232.000 C 176.000 236.418 172.418 240.000 168.000 240.000 L 88.000 240.000 C 83.582 240.000 80.000 236.418 80.000 232.000 C 80.000 227.582 83.582 224.000 88.000 224.000 L 168.000 224.000 C 172.418 224.000 176.000 227.582 176.000 232.000 ZM 216.000 104.000 C 216.070 131.026 203.654 156.569 182.360 173.210 C 178.378 176.262 176.031 180.983 176.000 186.000 L 176.000 192.000 C 176.000 200.837 168.837 208.000 160.000 208.000 L 96.000 208.000 C 87.163 208.000 80.000 200.837 80.000 192.000 L 80.000 186.000 C 79.997 181.043 77.696 176.367 73.770 173.340 C 52.531 156.799 40.078 131.410 40.000 104.490 C 39.740 56.830 78.260 17.140 125.880 16.000 C 149.584 15.429 172.516 24.447 189.480 41.013 C 206.445 57.578 216.007 80.289 216.000 104.000 ZM 165.660 106.340 C 164.159 104.838 162.123 103.994 160.000 103.994 C 157.877 103.994 155.841 104.838 154.340 106.340 L 128.000 132.690 L 101.660 106.340 C 98.534 103.214 93.466 103.214 90.340 106.340 C 87.214 109.466 87.214 114.534 90.340 117.660 L 120.000 147.310 L 120.000 184.000 C 120.000 188.418 123.582 192.000 128.000 192.000 C 132.418 192.000 136.000 188.418 136.000 184.000 L 136.000 147.310 L 165.660 117.660 C 167.162 116.159 168.006 114.123 168.006 112.000 C 168.006 109.877 167.162 107.841 165.660 106.340 Z"),
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

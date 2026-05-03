package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorFillIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 102.000 C 240.000 172.000 136.210 228.660 131.790 231.000 C 129.424 232.273 126.576 232.273 124.210 231.000 C 120.860 229.200 60.660 196.310 31.530 150.110 C 30.765 148.878 30.727 147.328 31.431 146.059 C 32.134 144.791 33.469 144.003 34.920 144.000 L 72.000 144.000 C 74.676 144.002 77.175 142.666 78.660 140.440 L 88.000 126.440 L 113.340 164.440 C 115.336 167.433 119.083 168.726 122.500 167.600 C 124.263 167.003 125.772 165.825 126.780 164.260 L 140.280 144.000 L 160.000 144.000 C 162.217 144.005 164.336 143.090 165.853 141.473 C 167.369 139.856 168.147 137.682 168.000 135.470 C 167.629 131.205 164.031 127.947 159.750 128.000 L 136.000 128.000 C 133.324 127.998 130.825 129.334 129.340 131.560 L 120.000 145.560 L 94.660 107.560 C 92.663 104.563 88.910 103.269 85.490 104.400 C 83.731 105.001 82.226 106.177 81.220 107.740 L 67.720 128.000 L 23.530 128.000 C 21.775 128.005 20.222 126.865 19.700 125.190 C 17.287 117.695 16.039 109.874 16.000 102.000 C 16.039 67.774 43.774 40.039 78.000 40.000 C 98.650 40.000 116.730 48.880 128.000 63.890 C 139.270 48.880 157.350 40.000 178.000 40.000 C 212.226 40.039 239.961 67.774 240.000 102.000 Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null

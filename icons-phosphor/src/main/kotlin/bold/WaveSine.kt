package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorBoldIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 242.860 133.100 C 219.860 182.100 199.860 204.000 178.040 204.000 C 150.400 204.000 134.240 169.560 117.140 133.100 C 110.000 117.780 102.530 102.000 94.920 90.730 C 88.390 81.090 82.530 76.000 78.000 76.000 C 74.180 76.000 59.760 80.120 34.910 133.100 C 32.093 139.101 24.946 141.682 18.945 138.865 C 12.944 136.048 10.363 128.901 13.180 122.900 C 36.180 73.900 56.180 52.000 78.000 52.000 C 105.640 52.000 121.800 86.440 138.900 122.900 C 146.090 138.220 153.510 154.050 161.120 165.270 C 167.650 174.910 173.510 180.000 178.120 180.000 C 181.940 180.000 196.360 175.880 221.210 122.900 C 224.027 116.899 231.174 114.318 237.175 117.135 C 243.176 119.952 245.757 127.099 242.940 133.100 Z"),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null

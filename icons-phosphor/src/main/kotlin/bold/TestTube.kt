package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorBoldIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.490 83.510 L 180.490 23.510 C 178.238 21.251 175.180 19.981 171.990 19.981 C 168.800 19.981 165.742 21.251 163.490 23.510 L 34.280 152.750 C 15.226 171.804 15.226 202.696 34.280 221.750 C 53.334 240.804 84.226 240.804 103.280 221.750 L 214.480 110.490 L 235.790 103.380 C 239.737 102.067 242.723 98.804 243.681 94.756 C 244.638 90.707 243.431 86.452 240.490 83.510 ZM 86.280 204.750 C 76.508 213.744 61.382 213.431 51.991 204.039 C 42.599 194.648 42.286 179.522 51.280 169.750 L 79.410 141.620 C 87.140 139.210 98.990 138.620 114.470 146.620 C 121.378 150.297 128.766 152.990 136.420 154.620 ZM 204.200 88.620 C 202.436 89.212 200.831 90.200 199.510 91.510 L 160.620 130.410 C 152.890 132.820 141.040 133.410 125.560 125.410 C 118.655 121.734 111.270 119.041 103.620 117.410 L 172.000 49.000 L 209.790 86.790 Z"),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null

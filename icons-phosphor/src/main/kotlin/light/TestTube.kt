package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorLightIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.240 87.760 L 176.240 27.760 C 173.897 25.420 170.103 25.420 167.760 27.760 L 38.530 157.000 C 27.311 167.716 22.775 183.666 26.675 198.682 C 30.576 213.698 42.302 225.424 57.318 229.325 C 72.334 233.225 88.284 228.689 99.000 217.470 L 211.240 105.240 L 233.900 97.690 C 235.870 97.030 237.359 95.399 237.835 93.377 C 238.312 91.354 237.708 89.230 236.240 87.760 ZM 90.530 209.000 C 78.510 221.020 59.020 221.020 47.000 209.000 C 34.980 196.980 34.980 177.490 47.000 165.470 L 76.130 136.350 C 84.970 133.210 98.970 131.790 117.210 141.350 C 129.490 147.760 140.340 150.010 149.480 150.060 ZM 206.100 94.310 C 205.218 94.605 204.417 95.102 203.760 95.760 L 163.860 135.650 C 155.020 138.790 141.020 140.210 122.780 130.650 C 110.500 124.270 99.650 122.000 90.510 122.000 L 172.000 40.490 L 220.890 89.380 Z"),
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

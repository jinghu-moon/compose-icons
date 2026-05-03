package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorFillIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 86.340 L 177.660 26.340 C 176.159 24.838 174.123 23.994 172.000 23.994 C 169.877 23.994 167.841 24.838 166.340 26.340 L 37.110 155.570 C 19.625 173.055 19.625 201.405 37.110 218.890 C 54.595 236.375 82.945 236.375 100.430 218.890 L 212.320 107.000 L 234.530 99.600 C 237.162 98.724 239.153 96.548 239.791 93.848 C 240.429 91.148 239.622 88.311 237.660 86.350 ZM 205.470 92.410 C 204.291 92.802 203.219 93.462 202.340 94.340 L 162.770 133.910 C 154.300 136.810 141.020 137.910 123.700 128.910 C 113.100 123.370 103.520 120.910 95.140 120.180 L 172.000 43.310 L 217.190 88.500 Z"),
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

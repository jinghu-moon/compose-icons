package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorDuotoneIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 167.180 140.820 L 94.770 213.230 C 80.410 227.589 57.130 227.589 42.770 213.230 L 42.770 213.230 C 28.411 198.870 28.411 175.590 42.770 161.230 L 72.770 131.230 C 82.140 127.580 98.550 124.870 119.950 136.050 C 141.350 147.230 157.810 144.470 167.180 140.820 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 237.660 86.340 L 177.660 26.340 C 176.159 24.838 174.123 23.994 172.000 23.994 C 169.877 23.994 167.841 24.838 166.340 26.340 L 37.110 155.570 C 19.625 173.055 19.625 201.405 37.110 218.890 C 54.595 236.375 82.945 236.375 100.430 218.890 L 212.320 107.000 L 234.530 99.600 C 237.162 98.724 239.153 96.548 239.791 93.848 C 240.429 91.148 239.622 88.311 237.660 86.350 ZM 89.110 207.570 C 77.818 218.453 59.891 218.287 48.802 207.198 C 37.713 196.109 37.547 178.182 48.430 166.890 L 77.230 138.090 C 85.700 135.190 98.980 134.090 116.300 143.090 C 126.900 148.630 136.480 151.090 144.860 151.820 ZM 205.470 92.410 C 204.291 92.802 203.219 93.462 202.340 94.340 L 162.770 133.910 C 154.300 136.810 141.020 137.910 123.700 128.910 C 113.100 123.370 103.520 120.910 95.140 120.180 L 172.000 43.310 L 217.190 88.500 Z"),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null

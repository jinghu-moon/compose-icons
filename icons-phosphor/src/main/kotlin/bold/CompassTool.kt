package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorBoldIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.680 125.460 C 220.690 121.636 220.489 117.027 218.155 113.392 C 215.820 109.757 211.712 107.657 207.398 107.895 C 203.084 108.133 199.231 110.671 197.310 114.540 C 190.979 126.767 181.411 137.020 169.650 144.180 L 156.150 113.790 C 168.675 103.342 174.392 86.824 171.007 70.869 C 167.621 54.914 155.688 42.141 140.000 37.680 L 140.000 24.000 C 140.000 17.373 134.627 12.000 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 L 116.000 37.680 C 100.312 42.141 88.379 54.914 84.993 70.869 C 81.608 86.824 87.325 103.342 99.850 113.790 L 53.000 219.120 C 51.697 222.037 51.611 225.354 52.762 228.335 C 53.913 231.316 56.205 233.715 59.130 235.000 C 60.664 235.674 62.324 236.014 64.000 236.000 C 68.756 236.013 73.070 233.216 75.000 228.870 L 98.670 175.610 C 108.173 178.530 118.059 180.010 128.000 180.000 C 137.954 179.990 147.854 178.535 157.390 175.680 L 181.000 228.870 C 182.930 233.216 187.244 236.013 192.000 236.000 C 193.672 236.013 195.329 235.673 196.860 235.000 C 199.787 233.717 202.081 231.319 203.234 228.337 C 204.387 225.356 204.302 222.039 203.000 219.120 L 179.490 166.220 C 196.224 156.714 209.839 142.554 218.680 125.460 ZM 128.000 60.000 C 139.046 60.000 148.000 68.954 148.000 80.000 C 148.000 91.046 139.046 100.000 128.000 100.000 C 116.954 100.000 108.000 91.046 108.000 80.000 C 108.000 68.954 116.954 60.000 128.000 60.000 ZM 128.000 156.000 C 121.411 156.009 114.849 155.158 108.480 153.470 L 121.780 123.550 C 125.905 124.150 130.095 124.150 134.220 123.550 L 147.550 153.550 C 141.161 155.178 134.593 156.001 128.000 156.000 Z"),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null

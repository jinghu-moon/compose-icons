package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorThinIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.560 121.820 C 212.261 120.543 212.213 118.985 211.433 117.754 C 210.653 116.523 209.265 115.813 207.811 115.902 C 206.356 115.991 205.065 116.863 204.440 118.180 C 195.977 134.443 182.429 147.492 165.860 155.340 L 146.180 111.050 C 159.545 103.206 166.391 87.689 163.174 72.529 C 159.957 57.370 147.399 45.970 132.000 44.230 L 132.000 24.000 C 132.000 21.791 130.209 20.000 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 44.230 C 108.601 45.970 96.043 57.370 92.826 72.529 C 89.609 87.689 96.455 103.206 109.820 111.050 L 60.350 222.370 C 59.449 224.380 60.343 226.741 62.350 227.650 C 62.868 227.886 63.431 228.006 64.000 228.000 C 65.584 228.001 67.019 227.068 67.660 225.620 L 94.320 165.620 C 105.044 169.852 116.471 172.016 128.000 172.000 C 139.534 171.988 150.970 169.880 161.750 165.780 L 188.340 225.620 C 188.981 227.068 190.416 228.001 192.000 228.000 C 192.559 228.001 193.112 227.882 193.620 227.650 C 195.627 226.741 196.521 224.380 195.620 222.370 L 169.080 162.640 C 187.332 154.058 202.257 139.715 211.560 121.820 ZM 100.000 80.000 C 100.000 64.536 112.536 52.000 128.000 52.000 C 143.464 52.000 156.000 64.536 156.000 80.000 C 156.000 95.464 143.464 108.000 128.000 108.000 C 112.536 108.000 100.000 95.464 100.000 80.000 ZM 128.000 164.000 C 117.591 164.021 107.270 162.095 97.570 158.320 L 117.130 114.320 C 124.204 116.560 131.796 116.560 138.870 114.320 L 158.500 158.470 C 148.744 162.115 138.415 163.988 128.000 164.000 Z"),
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

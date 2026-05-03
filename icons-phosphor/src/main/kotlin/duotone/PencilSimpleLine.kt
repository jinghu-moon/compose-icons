package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) return _pencilSimpleLine!!
        _pencilSimpleLine = phosphorDuotoneIcon(
            name = "PencilSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 221.660 90.340 L 192.000 120.000 L 136.000 64.000 L 165.660 34.340 C 168.784 31.218 173.846 31.218 176.970 34.340 L 221.660 79.000 C 223.168 80.501 224.016 82.542 224.016 84.670 C 224.016 86.798 223.168 88.839 221.660 90.340 Z"),
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
        pathData = parseSvgPathData("M 227.320 73.370 L 182.630 28.690 C 179.629 25.689 175.559 24.002 171.315 24.002 C 167.071 24.002 163.001 25.689 160.000 28.690 L 36.690 152.000 C 33.676 154.990 31.986 159.064 32.000 163.310 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 C 224.000 211.582 220.418 208.000 216.000 208.000 L 115.320 208.000 L 227.320 96.000 C 230.321 92.999 232.008 88.929 232.008 84.685 C 232.008 80.441 230.321 76.371 227.320 73.370 ZM 48.000 163.310 L 136.000 75.310 L 180.690 120.000 L 92.690 208.000 L 48.000 208.000 ZM 192.000 108.690 L 147.320 64.000 L 171.320 40.000 L 216.000 84.690 Z"),
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
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null

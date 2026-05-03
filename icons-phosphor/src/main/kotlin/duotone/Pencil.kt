package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pencil: ImageVector
    get() {
        if (_pencil != null) return _pencil!!
        _pencil = phosphorDuotoneIcon(
            name = "Pencil",
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
        pathData = parseSvgPathData("M 227.310 73.370 L 182.630 28.680 C 179.629 25.679 175.559 23.992 171.315 23.992 C 167.071 23.992 163.001 25.679 160.000 28.680 L 36.690 152.000 C 33.676 154.990 31.986 159.064 32.000 163.310 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 92.690 224.000 C 96.936 224.014 101.010 222.324 104.000 219.310 L 227.310 96.000 C 230.311 92.999 231.998 88.929 231.998 84.685 C 231.998 80.441 230.311 76.371 227.310 73.370 ZM 51.310 160.000 L 136.000 75.310 L 152.690 92.000 L 68.000 176.680 ZM 48.000 179.310 L 76.690 208.000 L 48.000 208.000 ZM 96.000 204.690 L 79.310 188.000 L 164.000 103.310 L 180.690 120.000 ZM 192.000 108.690 L 147.310 64.000 L 171.310 40.000 L 216.000 84.680 Z"),
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
        return _pencil!!
    }

private var _pencil: ImageVector? = null

package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorDuotoneIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 91.550 L 224.000 164.450 C 224.002 166.572 223.160 168.608 221.660 170.110 L 170.110 221.660 C 168.608 223.160 166.572 224.002 164.450 224.000 L 91.550 224.000 C 89.428 224.002 87.392 223.160 85.890 221.660 L 34.340 170.110 C 32.840 168.608 31.998 166.572 32.000 164.450 L 32.000 91.550 C 31.998 89.428 32.840 87.392 34.340 85.890 L 85.890 34.340 C 87.392 32.840 89.428 31.998 91.550 32.000 L 164.450 32.000 C 166.572 31.998 168.608 32.840 170.110 34.340 L 221.660 85.890 C 223.160 87.392 224.002 89.428 224.000 91.550 Z"),
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
        pathData = parseSvgPathData("M 227.310 80.240 L 175.760 28.690 C 172.770 25.676 168.696 23.986 164.450 24.000 L 91.550 24.000 C 87.304 23.986 83.230 25.676 80.240 28.690 L 28.690 80.240 C 25.676 83.230 23.986 87.304 24.000 91.550 L 24.000 164.450 C 23.986 168.696 25.676 172.770 28.690 175.760 L 80.240 227.310 C 83.230 230.324 87.304 232.014 91.550 232.000 L 164.450 232.000 C 168.696 232.014 172.770 230.324 175.760 227.310 L 227.310 175.760 C 230.324 172.770 232.014 168.696 232.000 164.450 L 232.000 91.550 C 232.014 87.304 230.324 83.230 227.310 80.240 ZM 216.000 164.450 L 164.450 216.000 L 91.550 216.000 L 40.000 164.450 L 40.000 91.550 L 91.550 40.000 L 164.450 40.000 L 216.000 91.550 Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null

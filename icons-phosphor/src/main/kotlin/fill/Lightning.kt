package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorFillIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.850 125.460 L 101.850 245.460 C 99.412 248.062 95.545 248.736 92.370 247.113 C 89.195 245.489 87.478 241.960 88.160 238.460 L 102.820 165.130 L 45.190 143.490 C 42.676 142.550 40.801 140.411 40.198 137.796 C 39.594 135.181 40.342 132.437 42.190 130.490 L 154.190 10.490 C 156.628 7.888 160.495 7.214 163.670 8.837 C 166.845 10.461 168.562 13.990 167.880 17.490 L 153.180 90.900 L 210.810 112.510 C 213.305 113.457 215.164 115.585 215.766 118.184 C 216.368 120.784 215.635 123.513 213.810 125.460 Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null

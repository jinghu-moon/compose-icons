package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LockSimpleOpen: ImageVector
    get() {
        if (_lockSimpleOpen != null) return _lockSimpleOpen!!
        _lockSimpleOpen = phosphorFillIcon(
            name = "LockSimpleOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 96.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 96.000 C 32.000 87.163 39.163 80.000 48.000 80.000 L 80.000 80.000 L 80.000 56.000 C 80.028 29.502 101.502 8.028 128.000 8.000 C 151.200 8.000 171.320 24.150 175.840 46.410 C 176.669 50.718 173.874 54.891 169.574 55.763 C 165.275 56.635 161.075 53.881 160.160 49.590 C 157.200 35.000 143.370 24.000 128.000 24.000 C 110.327 24.000 96.000 38.327 96.000 56.000 L 96.000 80.000 L 208.000 80.000 C 216.837 80.000 224.000 87.163 224.000 96.000 Z"),
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
        return _lockSimpleOpen!!
    }

private var _lockSimpleOpen: ImageVector? = null

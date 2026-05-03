package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorDuotoneIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 40.000 L 192.000 192.000 L 40.000 192.000 Z"),
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
        pathData = parseSvgPathData("M 195.060 32.610 C 192.071 31.370 188.629 32.053 186.340 34.340 L 34.340 186.340 C 32.049 188.628 31.364 192.071 32.603 195.062 C 33.842 198.053 36.762 200.003 40.000 200.000 L 192.000 200.000 C 196.418 200.000 200.000 196.418 200.000 192.000 L 200.000 40.000 C 199.999 36.764 198.050 33.848 195.060 32.610 ZM 184.000 184.000 L 59.310 184.000 L 184.000 59.310 Z"),
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
        return _notches!!
    }

private var _notches: ImageVector? = null

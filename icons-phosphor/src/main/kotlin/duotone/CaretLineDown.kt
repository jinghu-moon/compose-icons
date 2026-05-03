package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorDuotoneIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 72.000 L 128.000 152.000 L 48.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 122.340 157.660 C 123.841 159.162 125.877 160.006 128.000 160.006 C 130.123 160.006 132.159 159.162 133.660 157.660 L 213.660 77.660 C 215.951 75.372 216.636 71.929 215.397 68.938 C 214.158 65.947 211.238 63.997 208.000 64.000 L 48.000 64.000 C 44.762 63.997 41.842 65.947 40.603 68.938 C 39.364 71.929 40.049 75.372 42.340 77.660 ZM 188.690 80.000 L 128.000 140.690 L 67.310 80.000 ZM 216.000 192.000 C 216.000 196.418 212.418 200.000 208.000 200.000 L 48.000 200.000 C 43.582 200.000 40.000 196.418 40.000 192.000 C 40.000 187.582 43.582 184.000 48.000 184.000 L 208.000 184.000 C 212.418 184.000 216.000 187.582 216.000 192.000 Z"),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null

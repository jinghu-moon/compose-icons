package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorDuotoneIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 48.000 L 192.000 208.000 L 112.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 195.060 40.610 C 192.071 39.370 188.629 40.053 186.340 42.340 L 106.340 122.340 C 104.838 123.841 103.994 125.877 103.994 128.000 C 103.994 130.123 104.838 132.159 106.340 133.660 L 186.340 213.660 C 188.628 215.951 192.071 216.636 195.062 215.397 C 198.053 214.158 200.003 211.238 200.000 208.000 L 200.000 48.000 C 199.999 44.764 198.050 41.848 195.060 40.610 ZM 184.000 188.690 L 123.310 128.000 L 184.000 67.310 ZM 80.000 48.000 L 80.000 208.000 C 80.000 212.418 76.418 216.000 72.000 216.000 C 67.582 216.000 64.000 212.418 64.000 208.000 L 64.000 48.000 C 64.000 43.582 67.582 40.000 72.000 40.000 C 76.418 40.000 80.000 43.582 80.000 48.000 Z"),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null

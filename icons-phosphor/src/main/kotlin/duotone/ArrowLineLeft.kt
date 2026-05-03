package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorDuotoneIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 144.000 56.000 L 144.000 200.000 L 72.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 120.000 L 152.000 120.000 L 152.000 56.000 C 152.003 52.762 150.053 49.842 147.062 48.603 C 144.071 47.364 140.628 48.049 138.340 50.340 L 66.340 122.340 C 64.838 123.841 63.994 125.877 63.994 128.000 C 63.994 130.123 64.838 132.159 66.340 133.660 L 138.340 205.660 C 140.628 207.951 144.071 208.636 147.062 207.397 C 150.053 206.158 152.003 203.238 152.000 200.000 L 152.000 136.000 L 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 232.000 123.582 228.418 120.000 224.000 120.000 ZM 136.000 180.690 L 83.310 128.000 L 136.000 75.310 ZM 48.000 40.000 L 48.000 216.000 C 48.000 220.418 44.418 224.000 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 L 32.000 40.000 C 32.000 35.582 35.582 32.000 40.000 32.000 C 44.418 32.000 48.000 35.582 48.000 40.000 Z"),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null

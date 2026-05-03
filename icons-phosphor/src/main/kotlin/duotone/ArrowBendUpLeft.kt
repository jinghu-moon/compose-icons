package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorDuotoneIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 80.000 56.000 L 80.000 152.000 L 32.000 104.000 Z"),
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
        pathData = parseSvgPathData("M 128.000 96.000 L 88.000 96.000 L 88.000 56.000 C 88.003 52.762 86.053 49.842 83.062 48.603 C 80.071 47.364 76.628 48.049 74.340 50.340 L 26.340 98.340 C 24.838 99.841 23.994 101.877 23.994 104.000 C 23.994 106.123 24.838 108.159 26.340 109.660 L 74.340 157.660 C 76.628 159.951 80.071 160.636 83.062 159.397 C 86.053 158.158 88.003 155.238 88.000 152.000 L 88.000 112.000 L 128.000 112.000 C 176.578 112.055 215.945 151.422 216.000 200.000 C 216.000 204.418 219.582 208.000 224.000 208.000 C 228.418 208.000 232.000 204.418 232.000 200.000 C 231.939 142.588 185.412 96.061 128.000 96.000 ZM 72.000 132.690 L 43.310 104.000 L 72.000 75.310 Z"),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null

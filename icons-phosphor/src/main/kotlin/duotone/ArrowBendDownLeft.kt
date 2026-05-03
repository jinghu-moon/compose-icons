package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorDuotoneIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 80.000 104.000 L 80.000 200.000 L 32.000 152.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 48.000 C 219.582 48.000 216.000 51.582 216.000 56.000 C 215.945 104.578 176.578 143.945 128.000 144.000 L 88.000 144.000 L 88.000 104.000 C 88.003 100.762 86.053 97.842 83.062 96.603 C 80.071 95.364 76.628 96.049 74.340 98.340 L 26.340 146.340 C 24.838 147.841 23.994 149.877 23.994 152.000 C 23.994 154.123 24.838 156.159 26.340 157.660 L 74.340 205.660 C 76.628 207.951 80.071 208.636 83.062 207.397 C 86.053 206.158 88.003 203.238 88.000 200.000 L 88.000 160.000 L 128.000 160.000 C 185.412 159.939 231.939 113.412 232.000 56.000 C 232.000 51.582 228.418 48.000 224.000 48.000 ZM 72.000 180.690 L 43.310 152.000 L 72.000 123.310 Z"),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null

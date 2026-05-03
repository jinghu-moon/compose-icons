package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorDuotoneIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 120.000 L 56.000 120.000 L 128.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 205.660 114.340 L 133.660 42.340 C 132.159 40.838 130.123 39.994 128.000 39.994 C 125.877 39.994 123.841 40.838 122.340 42.340 L 50.340 114.340 C 48.049 116.628 47.364 120.071 48.603 123.062 C 49.842 126.053 52.762 128.003 56.000 128.000 L 200.000 128.000 C 203.238 128.003 206.158 126.053 207.397 123.062 C 208.636 120.071 207.951 116.628 205.660 114.340 ZM 75.310 112.000 L 128.000 59.310 L 180.690 112.000 Z"),
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
        return _control!!
    }

private var _control: ImageVector? = null

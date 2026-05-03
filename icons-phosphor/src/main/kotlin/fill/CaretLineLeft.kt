package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorFillIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 48.000 L 200.000 208.000 C 200.003 211.238 198.053 214.158 195.062 215.397 C 192.071 216.636 188.628 215.951 186.340 213.660 L 106.340 133.660 C 104.838 132.159 103.994 130.123 103.994 128.000 C 103.994 125.877 104.838 123.841 106.340 122.340 L 186.340 42.340 C 188.628 40.049 192.071 39.364 195.062 40.603 C 198.053 41.842 200.003 44.762 200.000 48.000 ZM 72.000 40.000 C 67.582 40.000 64.000 43.582 64.000 48.000 L 64.000 208.000 C 64.000 212.418 67.582 216.000 72.000 216.000 C 76.418 216.000 80.000 212.418 80.000 208.000 L 80.000 48.000 C 80.000 43.582 76.418 40.000 72.000 40.000 Z"),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null

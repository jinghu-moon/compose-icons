package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorThinIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 184.000 C 28.000 190.627 33.373 196.000 40.000 196.000 L 102.750 196.000 L 117.580 222.000 C 119.716 225.740 123.693 228.048 128.000 228.048 C 132.307 228.048 136.284 225.740 138.420 222.000 L 153.250 196.000 L 216.000 196.000 C 222.627 196.000 228.000 190.627 228.000 184.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 184.000 C 220.000 186.209 218.209 188.000 216.000 188.000 L 150.930 188.000 C 149.499 187.998 148.176 188.761 147.460 190.000 L 131.460 218.000 C 130.747 219.243 129.423 220.010 127.990 220.010 C 126.557 220.010 125.233 219.243 124.520 218.000 L 108.520 190.000 C 107.804 188.761 106.481 187.998 105.050 188.000 L 40.000 188.000 C 37.791 188.000 36.000 186.209 36.000 184.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 Z"),
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
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null

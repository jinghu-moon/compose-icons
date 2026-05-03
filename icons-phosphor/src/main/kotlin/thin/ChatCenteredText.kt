package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorThinIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 104.000 C 164.000 106.209 162.209 108.000 160.000 108.000 L 96.000 108.000 C 93.791 108.000 92.000 106.209 92.000 104.000 C 92.000 101.791 93.791 100.000 96.000 100.000 L 160.000 100.000 C 162.209 100.000 164.000 101.791 164.000 104.000 ZM 160.000 132.000 L 96.000 132.000 C 93.791 132.000 92.000 133.791 92.000 136.000 C 92.000 138.209 93.791 140.000 96.000 140.000 L 160.000 140.000 C 162.209 140.000 164.000 138.209 164.000 136.000 C 164.000 133.791 162.209 132.000 160.000 132.000 ZM 228.000 56.000 L 228.000 184.000 C 228.000 190.627 222.627 196.000 216.000 196.000 L 153.250 196.000 L 138.420 222.000 C 136.284 225.740 132.307 228.048 128.000 228.048 C 123.693 228.048 119.716 225.740 117.580 222.000 L 102.750 196.000 L 40.000 196.000 C 33.373 196.000 28.000 190.627 28.000 184.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 ZM 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 184.000 C 36.000 186.209 37.791 188.000 40.000 188.000 L 105.070 188.000 C 106.501 187.998 107.824 188.761 108.540 190.000 L 124.540 218.000 C 125.253 219.243 126.577 220.010 128.010 220.010 C 129.443 220.010 130.767 219.243 131.480 218.000 L 147.480 190.000 C 148.196 188.761 149.519 187.998 150.950 188.000 L 216.000 188.000 C 218.209 188.000 220.000 186.209 220.000 184.000 Z"),
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
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null

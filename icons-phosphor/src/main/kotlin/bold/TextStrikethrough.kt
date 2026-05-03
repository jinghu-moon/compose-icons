package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorBoldIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 185.860 140.000 C 192.589 147.756 196.202 157.733 196.000 168.000 C 196.000 182.450 188.190 196.320 174.570 206.050 C 162.000 215.050 145.440 220.000 128.000 220.000 C 110.560 220.000 94.000 215.050 81.430 206.050 C 67.810 196.320 60.000 182.450 60.000 168.000 C 60.000 161.373 65.373 156.000 72.000 156.000 C 78.627 156.000 84.000 161.373 84.000 168.000 C 84.000 183.180 104.150 196.000 128.000 196.000 C 151.850 196.000 172.000 183.180 172.000 168.000 C 172.000 155.240 162.700 147.820 136.650 140.000 L 40.000 140.000 C 33.373 140.000 28.000 134.627 28.000 128.000 C 28.000 121.373 33.373 116.000 40.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 ZM 75.110 100.000 C 81.737 100.000 87.110 94.627 87.110 88.000 C 87.110 72.000 104.690 60.000 128.000 60.000 C 145.360 60.000 159.370 66.650 165.480 77.780 C 168.836 83.230 175.878 85.087 181.485 82.000 C 187.092 78.914 189.290 71.971 186.480 66.220 C 176.130 47.300 154.250 36.000 128.000 36.000 C 91.000 36.000 63.110 58.350 63.110 88.000 C 63.110 94.627 68.483 100.000 75.110 100.000 Z"),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null

package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorBoldIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 58.890 178.860 C 61.773 180.225 65.082 180.386 68.084 179.307 C 71.086 178.228 73.535 175.998 74.890 173.110 L 90.440 140.000 L 165.560 140.000 L 181.140 173.110 C 183.962 179.108 191.112 181.682 197.110 178.860 C 203.108 176.038 205.682 168.888 202.860 162.890 L 138.860 26.890 C 136.882 22.682 132.650 19.995 128.000 19.995 C 123.350 19.995 119.118 22.682 117.140 26.890 L 53.140 162.890 C 51.784 165.770 51.628 169.071 52.707 172.066 C 53.785 175.061 56.009 177.505 58.890 178.860 ZM 128.000 60.180 L 154.270 116.000 L 101.730 116.000 ZM 228.000 216.000 C 228.000 222.627 222.627 228.000 216.000 228.000 L 40.000 228.000 C 33.373 228.000 28.000 222.627 28.000 216.000 C 28.000 209.373 33.373 204.000 40.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 209.373 228.000 216.000 Z"),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null

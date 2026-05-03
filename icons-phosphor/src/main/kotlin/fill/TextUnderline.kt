package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorFillIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 80.000 72.000 C 80.000 67.582 83.582 64.000 88.000 64.000 C 92.418 64.000 96.000 67.582 96.000 72.000 L 96.000 120.000 C 96.000 137.673 110.327 152.000 128.000 152.000 C 145.673 152.000 160.000 137.673 160.000 120.000 L 160.000 72.000 C 160.000 67.582 163.582 64.000 168.000 64.000 C 172.418 64.000 176.000 67.582 176.000 72.000 L 176.000 120.000 C 176.000 146.510 154.510 168.000 128.000 168.000 C 101.490 168.000 80.000 146.510 80.000 120.000 ZM 176.000 200.000 L 80.000 200.000 C 75.582 200.000 72.000 196.418 72.000 192.000 C 72.000 187.582 75.582 184.000 80.000 184.000 L 176.000 184.000 C 180.418 184.000 184.000 187.582 184.000 192.000 C 184.000 196.418 180.418 200.000 176.000 200.000 Z"),
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
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null

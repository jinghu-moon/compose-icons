package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorFillIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 184.000 96.000 C 184.000 100.418 180.418 104.000 176.000 104.000 C 171.582 104.000 168.000 100.418 168.000 96.000 L 168.000 88.000 L 136.000 88.000 L 136.000 176.000 L 148.000 176.000 C 152.418 176.000 156.000 179.582 156.000 184.000 C 156.000 188.418 152.418 192.000 148.000 192.000 L 108.000 192.000 C 103.582 192.000 100.000 188.418 100.000 184.000 C 100.000 179.582 103.582 176.000 108.000 176.000 L 120.000 176.000 L 120.000 88.000 L 88.000 88.000 L 88.000 96.000 C 88.000 100.418 84.418 104.000 80.000 104.000 C 75.582 104.000 72.000 100.418 72.000 96.000 L 72.000 80.000 C 72.000 75.582 75.582 72.000 80.000 72.000 L 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 Z"),
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
        return _textT!!
    }

private var _textT: ImageVector? = null

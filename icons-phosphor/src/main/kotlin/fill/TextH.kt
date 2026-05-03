package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextH: ImageVector
    get() {
        if (_textH != null) return _textH!!
        _textH = phosphorFillIcon(
            name = "TextH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 184.000 176.000 C 184.000 180.418 180.418 184.000 176.000 184.000 C 171.582 184.000 168.000 180.418 168.000 176.000 L 168.000 136.000 L 88.000 136.000 L 88.000 176.000 C 88.000 180.418 84.418 184.000 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 L 72.000 80.000 C 72.000 75.582 75.582 72.000 80.000 72.000 C 84.418 72.000 88.000 75.582 88.000 80.000 L 88.000 120.000 L 168.000 120.000 L 168.000 80.000 C 168.000 75.582 171.582 72.000 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 Z"),
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
        return _textH!!
    }

private var _textH: ImageVector? = null

package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorRegularIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 56.000 L 208.000 88.000 C 208.000 92.418 204.418 96.000 200.000 96.000 C 195.582 96.000 192.000 92.418 192.000 88.000 L 192.000 64.000 L 136.000 64.000 L 136.000 192.000 L 160.000 192.000 C 164.418 192.000 168.000 195.582 168.000 200.000 C 168.000 204.418 164.418 208.000 160.000 208.000 L 96.000 208.000 C 91.582 208.000 88.000 204.418 88.000 200.000 C 88.000 195.582 91.582 192.000 96.000 192.000 L 120.000 192.000 L 120.000 64.000 L 64.000 64.000 L 64.000 88.000 C 64.000 92.418 60.418 96.000 56.000 96.000 C 51.582 96.000 48.000 92.418 48.000 88.000 L 48.000 56.000 C 48.000 51.582 51.582 48.000 56.000 48.000 L 200.000 48.000 C 204.418 48.000 208.000 51.582 208.000 56.000 Z"),
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
        return _textT!!
    }

private var _textT: ImageVector? = null

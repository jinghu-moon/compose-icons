package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorThinIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 56.000 L 204.000 88.000 C 204.000 90.209 202.209 92.000 200.000 92.000 C 197.791 92.000 196.000 90.209 196.000 88.000 L 196.000 60.000 L 132.000 60.000 L 132.000 196.000 L 160.000 196.000 C 162.209 196.000 164.000 197.791 164.000 200.000 C 164.000 202.209 162.209 204.000 160.000 204.000 L 96.000 204.000 C 93.791 204.000 92.000 202.209 92.000 200.000 C 92.000 197.791 93.791 196.000 96.000 196.000 L 124.000 196.000 L 124.000 60.000 L 60.000 60.000 L 60.000 88.000 C 60.000 90.209 58.209 92.000 56.000 92.000 C 53.791 92.000 52.000 90.209 52.000 88.000 L 52.000 56.000 C 52.000 53.791 53.791 52.000 56.000 52.000 L 200.000 52.000 C 202.209 52.000 204.000 53.791 204.000 56.000 Z"),
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

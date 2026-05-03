package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) return _uniteSquare!!
        _uniteSquare = phosphorFillIcon(
            name = "UniteSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 96.000 L 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 96.000 224.000 C 91.582 224.000 88.000 220.418 88.000 216.000 L 88.000 168.000 L 40.000 168.000 C 35.582 168.000 32.000 164.418 32.000 160.000 L 32.000 40.000 C 32.000 35.582 35.582 32.000 40.000 32.000 L 160.000 32.000 C 164.418 32.000 168.000 35.582 168.000 40.000 L 168.000 88.000 L 216.000 88.000 C 220.418 88.000 224.000 91.582 224.000 96.000 Z"),
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
        return _uniteSquare!!
    }

private var _uniteSquare: ImageVector? = null

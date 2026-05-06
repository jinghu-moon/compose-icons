package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorBoldIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 52v152h28c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12v-176C28 33.373 33.373 28 40 28h40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM216 28h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28v152h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null

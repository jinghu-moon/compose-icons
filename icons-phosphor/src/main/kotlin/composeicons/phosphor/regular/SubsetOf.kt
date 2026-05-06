package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorRegularIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 208c0 4.418-3.582 8-8 8h-152c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h152c4.418 0 8 3.582 8 8ZM200 160h-96C77.49 160 56 138.51 56 112 56 85.49 77.49 64 104 64h96c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-96C68.654 48 40 76.654 40 112c0 35.346 28.654 64 64 64h96c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null

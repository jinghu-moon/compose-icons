package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorDuotoneIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 56v112h-96C73.072 168 48 142.928 48 112 48 81.072 73.072 56 104 56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
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

package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorDuotoneIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 48v160h-128l64-80L64 48Z"),
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
                pathData = parseSvgPathData("M184 72v-16h-103.35l53.6 67c2.34 2.923 2.34 7.077 0 10L80.65 200h103.35v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24c0 4.418-3.582 8-8 8h-128c-3.077 .002-5.882-1.761-7.215-4.534-1.333-2.773-.958-6.065 .965-8.466l60-75-60-75c-1.923-2.402-2.298-5.693-.965-8.466C58.118 41.761 60.923 39.998 64 40h128c4.418 0 8 3.582 8 8v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null

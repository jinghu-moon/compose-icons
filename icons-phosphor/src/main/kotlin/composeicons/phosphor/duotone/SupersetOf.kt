package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorDuotoneIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 104c0 30.928-25.072 56-56 56h-96v-112h96c30.928 0 56 25.072 56 56Z"),
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
                pathData = parseSvgPathData("M216 200c0 4.418-3.582 8-8 8h-152c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h152c4.418 0 8 3.582 8 8ZM152 152h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h96c35.346 0 64-28.654 64-64C216 68.654 187.346 40 152 40h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h96c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48Z"),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null

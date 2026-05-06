package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorRegularIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40c0 4.418-3.582 8-8 8h-29.29c-11.603-.003-21.546 8.294-23.62 19.71L137.59 120h46.41c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-49.32l-10 55.16C121.218 210.191 104.633 224.017 85.29 224h-29.29c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h29.29c11.603 .003 21.546-8.294 23.62-19.71L118.41 136h-46.41c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h49.32L131.32 64.84C134.782 45.809 151.367 31.983 170.71 32h29.29c4.418 0 8 3.582 8 8Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null

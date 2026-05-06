package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.City: ImageVector
    get() {
        if (_city != null) return _city!!
        _city = phosphorRegularIcon(
            name = "City",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 208h-8v-120c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8v40h-48v-88c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8v168h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM168 96h48v112h-48ZM152 144v64h-48v-64ZM40 48h48v160h-48ZM72 72v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM72 120v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM72 168v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM120 184v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM184 184v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM184 136v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _city!!
    }

private var _city: ImageVector? = null

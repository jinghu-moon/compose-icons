package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = phosphorDuotoneIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24v208h-48v-48h-48v48h-48v-208Z"),
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
                pathData = parseSvgPathData("M232 224h-24v-192h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v192h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h208c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM64 32h128v192h-32v-40c0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8v40h-32ZM144 224h-32v-32h32ZM88 64c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM136 64c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM88 104c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM136 104c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM88 144c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM136 144c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8Z"),
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
        return _building!!
    }

private var _building: ImageVector? = null

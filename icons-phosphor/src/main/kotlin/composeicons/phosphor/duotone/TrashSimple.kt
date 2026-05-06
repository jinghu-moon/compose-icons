package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorDuotoneIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 56v152c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8v-152Z"),
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
                pathData = parseSvgPathData("M216 48h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v144c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-144h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM192 208h-128v-144h128ZM80 24c0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-80c-4.418 0-8-3.582-8-8Z"),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null

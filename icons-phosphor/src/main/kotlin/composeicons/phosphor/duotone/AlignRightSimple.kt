package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorDuotoneIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 96v64c0 4.418-3.582 8-8 8h-152c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8h152c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M232 56v144c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-144c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 96v64c0 8.837-7.163 16-16 16h-152c-8.837 0-16-7.163-16-16v-64C16 87.163 23.163 80 32 80h152c8.837 0 16 7.163 16 16ZM184 96h-152v64h152Z"),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null

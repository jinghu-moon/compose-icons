package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorDuotoneIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 160h72v56c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8ZM216 96h-72v64h72c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM136 32h-64c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8h72v-56c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M216 88h-64v-48c0-8.837-7.163-16-16-16h-64C63.163 24 56 31.163 56 40v48c0 8.837 7.163 16 16 16h64v48h-64c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h64c8.837 0 16-7.163 16-16v-48h64c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM136 216h-64v-48h64ZM136 40v48h-64v-48h64ZM216 152h-64v-48h64Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null

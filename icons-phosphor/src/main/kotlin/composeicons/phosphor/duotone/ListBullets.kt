package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorDuotoneIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 64v128h-128v-128Z"),
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
                pathData = parseSvgPathData("M80 64c0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8ZM216 120h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h128c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM216 184h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h128c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM44 52C37.373 52 32 57.373 32 64c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C56 57.373 50.627 52 44 52ZM44 116c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 180c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null

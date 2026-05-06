package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorDuotoneIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40v176c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M144 192c0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8ZM120 72h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM136 120h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16ZM56 152h144v-48h-144ZM56 40v48h144v-48ZM200 216v-48h-144v48h144Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
